package com.sp.app.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calc3/*")
public class CalculatorController3 {
	
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
