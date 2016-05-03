package com.luox2014.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import com.luox2014.bean.Article;
import com.luox2014.service.ArticleService;
import com.luox2014.service.ArticleServiceImpl;

/**
 * Servlet implementation class ArticleServlet
 */
@WebServlet("/ArticleServlet")
public class ArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArticleService articleService = new ArticleServiceImpl();
		
		ArrayList articleList = (ArrayList) articleService.queryArticle(1, 10, "article_date");
		//Article article = (Article) arrayList.get(0);
		Article article = null;
		JSONObject json = new JSONObject();
		for(int i = 0;i<articleList.size();i++){
			 article = (Article) articleList.get(i);
			json.put("ArticleTitle",  article.getTitle());
		}
		//String txt = "{\"Article\":[" + json+"]}";
		System.out.println(json);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(json);
	}

}
