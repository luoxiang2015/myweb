package com.luox2014.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luox2014.bean.Article;
import com.luox2014.service.TestService;


@Controller
@RequestMapping(value="/spring")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value="/test", produces ="application/json;charset=UTF-8")
	@ResponseBody
	public List<Article> test(){
		System.out.println(testService.Test().get(0).getArticle_author());
		return testService.Test();
		//浏览器乱码 右键点击查看源代码
	}
	
	@RequestMapping(value="/testEncode",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String testEncode(){
		return "中文乱码";
	}
	
	
}
