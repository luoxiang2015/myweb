package com.luox2014.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.luox2014.bean.Article;


@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	

	@Override
	public Article queryArticleById(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("select * from T_Article where ART_ID ="+ id).addEntity(Article.class);
		Article article=  (Article) q.uniqueResult();
		//session.flush();
		//session.clear();
		tx.commit();
		session.close();
		return article;
	}

	@Override
	public List<Article> queryArticle(int mark, int num, String sort) {
		// TODO Auto-generated method stub
		Session session=null;
		session =  sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("select * from T_Article where ART_Mark ='"+ mark+"' order by '"+sort+"' desc limit "+num).addEntity(Article.class);
			@SuppressWarnings("unchecked")
			ArrayList<Article> articleList= (ArrayList<Article>) q.list();
			//session.flush();
			//session.clear();
			tx.commit();
			session.close();
            return articleList;
	}

	@Override
	public List<Article> queryArticleTop(int sum) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("SELECT * FROM T_Article ORDER BY ART_Create_Time DESC LIMIT "+sum).addEntity(Article.class);
		q.setCacheable(false);
		ArrayList<Article> articleList= (ArrayList<Article>) q.list();
		//session.flush();
		//session.clear();
		tx.commit();
		session.close();
        return articleList;
	}

	@Override
	public String saveArticle(Article article) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(article);
		tx.commit();
		session.close();
		
		return "success";
	}



}
