package com.luox2014.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@RequestMapping(value="/home")
	public ModelAndView getHome(){
		
		/*ModelMap model = new ModelMap();
		model.addAttribute("list", "lissskdf");
		
		return new ModelAndView("index",model);*/
		return new ModelAndView("index");
	}

}
