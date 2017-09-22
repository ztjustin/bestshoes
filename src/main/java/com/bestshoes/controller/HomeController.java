package com.bestshoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping({"/index","/"})
	public ModelAndView index(){
		ModelAndView mvn = new ModelAndView();
		mvn.setViewName("index");
		return  mvn;
	}
	
}
