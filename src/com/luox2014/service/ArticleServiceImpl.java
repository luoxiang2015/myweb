package com.luox2014.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.luox2014.bean.Article;
import com.luox2014.dao.ArticleDao;
import com.luox2014.dao.ArticleDaoImpl;

@Service
//@Transactional
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	//@Transactional(propagation = Propagation.REQUIRED)
	public Article queryArticleById(String id) {
		// TODO Auto-generated method stub
		return articleDao.queryArticleById(id);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED)
	public List<Article> queryArticle(int mark, int num, String sort) {
		// TODO Auto-generated method stub
		return articleDao.queryArticle(mark, num, sort);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED)
	public List<Article> queryArticleTop(int sum) {
		// TODO Auto-generated method stub
		return articleDao.queryArticleTop(sum);
	}

	@Override
	public String saveArticle(Article article) {
		// TODO Auto-generated method stub
		return articleDao.saveArticle(article);
	}

	




}
