package com.sp.app.user6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/*
 - @SessionAttributes
   : Model 객체를 세션에 저장하고 사용하기 위한 애노테이션
   : 클래스 레벨에서 선언
   : 지속적으로 입력 값을 유지하거나 여러 단계로 submit 되면서 완성되는 폼을 구성하는 경우 사용
   : 브라우저의 뒤로가기가 안됨
 */
@SessionAttributes("user")
@Controller("user6.userController")
@RequestMapping("/user6/*")
public class UserController {
	
	@ModelAttribute("user")
	public User command() {
		return new User();
	}
	
	@GetMapping("join")
	public String form() {
		return "user6/step1";
	}
	
	@PostMapping("step1")
	public String submit(@ModelAttribute("user") User user) {
		return "user6/step2";
	}
	
	@PostMapping("step2")
	public String step2(@ModelAttribute("user") User user, 
			SessionStatus sessionState, 
			Model model) {
				
		String s = "이름:" + user.getName() + "<br>"
				+ "이메일:" + user.getEmail() + "<br>"
				+ "아이디:" + user.getId() + "<br>"
				+ "패스워드:"+ user.getPwd() + "<br>"
				+ "전화번호:" + user.getTel();
		
		sessionState.setComplete(); // 세션에 저장된 내용 지우기
		
		model.addAttribute("message", s);
		
		return "user6/result";
	}
}
