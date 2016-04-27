package com.luox2014.service;

import com.luox2014.dao.TestDao;
import com.luox2014.dao.TestDaoImpl;

public class TestServiceImpl implements TestService{

private TestDao testDao;


	public TestDao getTestDao() {
	return testDao;
}


public void setTestDao(TestDao testDao) {
	this.testDao = testDao;
}


	@Override
	public String Test() {
		// TODO Auto-generated method stub
		//return testDao.Test();
		return testDao.Test();
	}

}
