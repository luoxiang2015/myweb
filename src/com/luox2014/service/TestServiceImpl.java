package com.luox2014.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luox2014.bean.Article;
import com.luox2014.dao.TestDao;
import com.luox2014.dao.TestDaoImpl;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;


	@Override
	public List<Article> Test() {
		// TODO Auto-generated method stub
		//return testDao.Test();
		return testDao.Test();
	}

}
