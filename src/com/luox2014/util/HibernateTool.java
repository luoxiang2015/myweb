package com.luox2014.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTool {
	
	private static SessionFactory sessionFactory;
	
	static{
		//��ȡ����
		Configuration config=new Configuration().configure();
		
		try {
			sessionFactory=config.buildSessionFactory();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//���sessionFacroy����
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
