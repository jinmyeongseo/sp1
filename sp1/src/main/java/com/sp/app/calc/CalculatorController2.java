package com.sp.app.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 - ModelAndView
   : 컨트롤러의 처리결과를 전달할 뷰의 이름과 뷰에 전달할 모델을 가지고 있음
 */
@Controller
@RequestMapping("/calc2/*")
public class CalculatorController2 {
	
	@Autowired
	private CalculatorService service;
	
	@GetMapping("write")
	public ModelAndView form() {
		return new ModelAndView("calc/write");
	}
	
	@PostMapping("write")
	public ModelAndView submit(Calculator dto) {
		ModelAndView mav = new ModelAndView("calc/result");
		
		int s = service.result(dto);
		
		mav.addObject("dto", dto);
		mav.addObject("result", s);
		
		return mav;
	}
	
	
}
