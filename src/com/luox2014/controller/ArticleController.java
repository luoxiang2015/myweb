package com.luox2014.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luox2014.bean.Article;
import com.luox2014.service.ArticleService;

@Controller
@RequestMapping(value="/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping(value="getTitle", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<Article> getArticleTitle(){
		List<Article> retList = articleService.queryArticle(1, 10, "article_date");
		return retList;
	}
	

}
