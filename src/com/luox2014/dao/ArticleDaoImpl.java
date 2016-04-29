package com.luox2014.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.luox2014.bean.Article;
import com.luox2014.util.HibernateTool;

@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	

	@Override
	public List<Article> queryArticleById(String article_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query q = session.createSQLQuery("select * from t_article where article_id ="+ article_id).addEntity(Article.class);
		@SuppressWarnings("unchecked")
		ArrayList<Article> articleList= (ArrayList<Article>) q.list();
		session.close();
		return articleList;
	}

	@Override
	public List<Article> queryArticle(int mark, int num, String sort) {
		// TODO Auto-generated method stub
		Session session=null;
		session =  sessionFactory.openSession();
		Query q = session.createSQLQuery("select * from t_article where article_mark ='"+ mark+"' order by '"+sort+"' desc limit "+num).addEntity(Article.class);
			@SuppressWarnings("unchecked")
			ArrayList<Article> articleList= (ArrayList<Article>) q.list();
			session.close();
            return articleList;
	}


}
