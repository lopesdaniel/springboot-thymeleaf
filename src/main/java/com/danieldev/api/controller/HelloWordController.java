package com.danieldev.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloWordController {

//	@RequestMapping(method = RequestMethod.GET, path = "/")
	
//	@GetMapping
//	public ModelAndView index(Model model) {
//		ModelAndView mv = new ModelAndView("/helloword");
//		
//		return mv;
//	}
	
	@GetMapping
	public String index(Model model) {
		return "helloword";
	}
	
}
