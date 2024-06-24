package com.sp.app.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	@GetMapping("write")
	public String form() {
		return "user/write";
	}
	
	@PostMapping("write")
	public String submit(String num, Model model) {
		
		try {
			int n = Integer.parseInt(num);
			int s = 0;
			for(int i=1; i<=n; i++) {
				s += i;
			}
			model.addAttribute("msg", "1~" + n + " 까지합은 " + s);
			
		} catch (Exception e) {
			return "redirect:/user/error"; // redirect
		}
		return "user/result";
	}
	
	@GetMapping("error")
	public String error() {
		return "user/error";
	}
}
