package com.luox2014.dao;

import java.util.List;

import com.luox2014.bean.Article;

public interface ArticleDao {
  public List<Article> queryArticleById(String id);
  
  public List<Article> queryArticle(int mark, int num, String sort);

public List<Article> queryArticleTop(int sum);
  
}
