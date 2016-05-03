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
	public Article queryArticleById(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query q = session.createSQLQuery("select * from T_Article where ART_ID ="+ id).addEntity(Article.class);
		Article article=  (Article) q.uniqueResult();
		session.close();
		return article;
	}

	@Override
	public List<Article> queryArticle(int mark, int num, String sort) {
		// TODO Auto-generated method stub
		Session session=null;
		session =  sessionFactory.openSession();
		Query q = session.createSQLQuery("select * from T_Article where ART_Mark ='"+ mark+"' order by '"+sort+"' desc limit "+num).addEntity(Article.class);
			@SuppressWarnings("unchecked")
			ArrayList<Article> articleList= (ArrayList<Article>) q.list();
			session.close();
            return articleList;
	}

	@Override
	public List<Article> queryArticleTop(int sum) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query q = session.createSQLQuery("SELECT * FROM T_Article ORDER BY ART_Create_Time desc LIMIT "+sum).addEntity(Article.class);
		ArrayList<Article> articleList= (ArrayList<Article>) q.list();
		session.close();
        return articleList;
	}


}
