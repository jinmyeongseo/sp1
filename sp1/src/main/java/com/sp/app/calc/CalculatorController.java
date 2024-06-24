package com.sp.app.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/calc/*")
public class CalculatorController {
	
	@Autowired
	private CalculatorService service;
	
	@GetMapping("write") // 스프링 4.3부터 가능 
	public String form() {
		
		return "calc/write";
	}
	
	@PostMapping("write")
	public String submit(int num1,  String operator, int num2, Model model) {
		/*
		 - 요청을 받는 메소드의 인수이름과 파라미터이름이 같으면 
		   요청하면서 보낸 파라미터를 받을 수 있다.
		 */
		
		Calculator dto = new Calculator();
		dto.setNum1(num1);
		dto.setNum2(num2);
		dto.setOperator(operator);
		
		int s = service.result(dto);
		
		// 포워딩할 JSP에 넘길 데이터(모델)
		model.addAttribute("dto", dto);
		model.addAttribute("result", s);
		
		return "calc/result";
	}
	
}
