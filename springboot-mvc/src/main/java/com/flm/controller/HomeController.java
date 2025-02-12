package com.flm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/emp4")
	public ModelAndView employee(ModelAndView mv) {
		mv.setViewName("employee"); 
		return mv;
	}
	
	@RequestMapping("/displayName")
	public String displayName(HttpServletRequest request, Model model){
		String name = request.getParameter("first_name");
		model.addAttribute("abc", name);
		return "hello";
	}
}
