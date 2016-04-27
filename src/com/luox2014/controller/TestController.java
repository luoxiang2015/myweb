package com.luox2014.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luox2014.bean.Article;
import com.luox2014.dao.ArticleDao;
import com.luox2014.dao.ArticleDaoImpl;
import com.luox2014.service.ArticleService;
import com.luox2014.service.TestService;
import com.luox2014.service.TestServiceImpl;


@Controller
@RequestMapping(value="/spring")
public class TestController {
 
/*private TestService testService;

	
	public TestService getTestService() {
	return testService;
}


public void setTestService(TestService testService) {
	this.testService = testService;
}
*/

	@SuppressWarnings("resource")
	@RequestMapping(value="/test", method = RequestMethod.GET)
	@ResponseBody
	public String test(){
		
		AbstractApplicationContext ctx
        = new ClassPathXmlApplicationContext(new String []{"/config/applicationContext.xml"});
		TestService ts = (TestService)ctx.getBean("testServiceImpl");
		return ts.Test();
		
		//return testService.Test();
		
		
	}
	
	
}
