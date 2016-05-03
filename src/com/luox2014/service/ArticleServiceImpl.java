package com.luox2014.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luox2014.bean.Article;
import com.luox2014.dao.ArticleDao;
import com.luox2014.dao.ArticleDaoImpl;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> queryArticleById(String id) {
		// TODO Auto-generated method stub
		return articleDao.queryArticleById(id);
	}

	@Override
	public List<Article> queryArticle(int mark, int num, String sort) {
		// TODO Auto-generated method stub
		return articleDao.queryArticle(mark, num, sort);
	}

	@Override
	public List<Article> queryArticleTop(int sum) {
		// TODO Auto-generated method stub
		return articleDao.queryArticleTop(sum);
	}
	




}
