package com.luox2014.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@RequestMapping(value="/home")
	public ModelAndView getHome(){
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("list", "dfsda");
		return new ModelAndView("index",map);
	}

}
