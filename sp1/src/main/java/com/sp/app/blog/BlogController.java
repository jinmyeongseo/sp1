package com.sp.app.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 - @PathVarivable
   : 메소드 매개변수가 URI 템플릿 변수에 바인딩되어야 함을 나타내는 애노테이션
   : @RequestMapping 이 있는 메소드에서만 지원
 */
@Controller
@RequestMapping("/blog/*")
public class BlogController {
	@Autowired
	private BlogService service;
	
	@GetMapping("main")
	public String main(Model model) {
		List<Blog> list = service.listBlog();
		
		model.addAttribute("list", list);
		
		return "blog/list";
	}
	
	// {blogIdx} : 템플릿변수
	@GetMapping("{blogIdx}/home")
	public String blogHome(@PathVariable long blogIdx, Model model) {
		
		Blog dto = service.findById(blogIdx);
		
		model.addAttribute("dto", dto);
		
		return "blog/home";
	}
	
	
}
