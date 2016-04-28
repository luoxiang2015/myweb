package com.luox2014.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.luox2014.bean.Article;

@Repository("testDao")
public class TestDaoImpl implements TestDao{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public List<Article> Test() {
		// TODO Auto-generated method stub
		
		Session s = sessionFactory.openSession();
		
		Query q = s.createSQLQuery("select * from t_article where article_mark ='"+ "工作学习"+"' order by '"+"article_date"+"' desc limit "+10).addEntity(Article.class);
		@SuppressWarnings("unchecked")
		ArrayList<Article> articleList= (ArrayList<Article>) q.list();
		s.close();
        return articleList;
		
		//return "test";
	}

}
