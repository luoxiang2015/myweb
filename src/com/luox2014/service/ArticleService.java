package com.luox2014.service;

import java.util.List;

import com.luox2014.bean.Article;

public interface ArticleService {
            //通过id获取对象
	public List<Article> queryArticleById(String article_id);
           //通过mark  、 日期排序、选择前几行
	public List<Article> queryArticle(int mark,int num,String sort);
  
}