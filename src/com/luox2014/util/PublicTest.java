package com.luox2014.util;


import com.luox2014.service.ArticleService;
import com.luox2014.service.ArticleServiceImpl;



public class PublicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        ArticleService service = new ArticleServiceImpl();
        System.out.println(service.queryArticle2("工作学习", 5, "article_date").get(0).getArticle_author());
		
		
   //a.queryArticle2("工作学习", 5, "date");
	}

}
