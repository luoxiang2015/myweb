package com.luox2014.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luox2014.bean.Article;
import com.luox2014.service.TestService;


@Controller
@RequestMapping(value="/spring")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value="/test", method = RequestMethod.GET)
	@ResponseBody
	public List<Article> test(){
		
		return testService.Test();
		
	}
	
	
}
