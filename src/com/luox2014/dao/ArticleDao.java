package com.luox2014.dao;

import java.util.List;

import com.luox2014.bean.Article;

public interface ArticleDao {
  public List<Article> queryArticle(String article_id);
  
  public List<Article> queryArticle2(String mark, int num, String sort);
  
}
