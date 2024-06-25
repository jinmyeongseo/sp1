package com.sp.app.user4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("user4.userController")
@RequestMapping("/user4/*")
public class UserController {
	
	@GetMapping("write")
	public String form(Model model) {
		
		List<String> list = new ArrayList<String>();
		list.add("대졸");
		list.add("고졸");
		list.add("기타");
		
		model.addAttribute("haks", list);
		return "user4/write";
	}
	
	@PostMapping("write")
	public String submit(User user, Model model) {
		
		model.addAttribute("dto", user);
		
		return "user4/result";
	}
	
	/*
	 - @ModelAttribute
	   : 컨트롤러 메소드의 파라미터나 리턴값을 Model 객체와 바인딩 하기 위한 애노테이션
	   : ModelMap.addAttribute("이름", 값)의 역할을 함
	 */
	@ModelAttribute("memberTypes")
	public List<String> getMemberTypes() {
		List<String> list = new ArrayList<String>();
		
		list.add("일반회원");
		list.add("기업회원");
		list.add("특별회원");
		
		return list;
	}
}
