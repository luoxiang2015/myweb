package com.luox2014.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/spring")
public class TestController {

	@RequestMapping(value="/test", method = RequestMethod.GET)
	@ResponseBody
	public String test(){
		return "return :  result ; ";
	}
	
	
	
	/*public String Test(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService service =new UserService();
        //UserDao userDao=(UserDao)factory.getBean("u");
        *//**
         * u已经配置在xml中，直接从配置文件中拿，这是spring一个重要的功能
         * 此时，思考能不能userservice也不要我们new而是直接从配置文件中拿：如果直接在xml中加bean然后从factory中拿，
         * 此时会报错，提示userdao没有初始化。
         * 此时spring另一个重要功能就用到了：可以直接在配置文件中将dao和service的关联关系设定好(见配置文件：上一步)
         *//*
        UserService service =(UserService)ctx.getBean("userService");
        User u =new User();
        service.add(u);
		return null;
	}*/
	
	
}
