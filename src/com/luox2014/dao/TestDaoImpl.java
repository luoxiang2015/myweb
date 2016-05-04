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

@Repository("testDao")
public class TestDaoImpl implements TestDao{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public List<Article> Test() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("select * from T_Article where ART_Mark ='"+ "工作学习"+"' order by '"+"ART_Date"+"' desc limit "+10).addEntity(Article.class);
		@SuppressWarnings("unchecked")
		ArrayList<Article> articleList= (ArrayList<Article>) q.list();
		//session.flush();
		session.clear();
		//tx.commit();
		session.close();
        return articleList;
		
		//return "test";
	}

}
