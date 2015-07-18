package com.luox2014.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.luox2014.bean.Article;
import com.luox2014.util.HibernateTool;

public class ArticleDaoImpl implements ArticleDao{

	@Override
	public List<Article> queryArticle(String article_id) {
		// TODO Auto-generated method stub
		System.out.println("已经进入    ArticleDaoImpl queryArticle  方法！ ");
		/*Configuration cfr = new Configuration().configure();
		SessionFactory factory = cfr.buildSessionFactory();*/
		Session session = null;
		session = HibernateTool.getSessionFactory().openSession();
		Query q = session.createSQLQuery("select * from t_article where article_id ="+ article_id).addEntity(Article.class);
		@SuppressWarnings("unchecked")
		ArrayList<Article> articleList= (ArrayList<Article>) q.list();
		session.close();
		return articleList;
	}

	@Override
	public List<Article> queryArticle2(String mark, int num, String sort) {
		// TODO Auto-generated method stub
		//System.out.println("已经进入    ArticleDaoImpl  queryArticle2  方法！");
		Session session=null;
		session =  HibernateTool.getSessionFactory().openSession();
		Query q = session.createSQLQuery("select * from t_article where article_mark ='"+ mark+"' order by '"+sort+"' desc limit "+num).addEntity(Article.class);
			@SuppressWarnings("unchecked")
			ArrayList<Article> articleList= (ArrayList<Article>) q.list();
			session.close();
            return articleList;
	}


}
