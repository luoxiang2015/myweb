package com.luox2014.action;


import org.apache.struts2.ServletActionContext;

import com.luox2014.bean.Article;
import com.luox2014.service.ArticleService;
import com.luox2014.service.ArticleServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Article article;

	public String test() {
		System.out.println("come in test");
	
	return "success";
	}

	public String getArticle() {
		System.out.println("进入action getArticle 方法");
		//获取从前端ajax中传来的参数；
		String mark = ServletActionContext.getRequest().getParameter("mark");
		int num = Integer.parseInt(ServletActionContext.getRequest().getParameter("num"));
		String sort = ServletActionContext.getRequest().getParameter("sort");
		ArticleService service = new ArticleServiceImpl();
		service.queryArticle2(mark, num, sort);
		//JSONArray jsonArray = JSONArray.from
		return "SUCCESS";

	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("进入ArticleAction");
		return super.execute();
	}

}
