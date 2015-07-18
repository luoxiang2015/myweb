package com.luox2014.service;

import java.util.List;

import com.luox2014.bean.Article;
import com.luox2014.dao.ArticleDao;
import com.luox2014.dao.ArticleDaoImpl;

public class ArticleServiceImpl implements ArticleService {

	private ArticleDao dao = new ArticleDaoImpl();
	@Override
	public List<Article> queryArticle(String article_id) {
		// TODO Auto-generated method stub
		return dao.queryArticle(article_id);
	}
	@Override
	public List<Article> queryArticle2(String mark, int num, String sort) {
		// TODO Auto-generated method stub
		return dao.queryArticle2( mark, num, sort);
	}




}
