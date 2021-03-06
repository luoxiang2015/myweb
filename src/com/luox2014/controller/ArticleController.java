package com.luox2014.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.luox2014.bean.Article;
import com.luox2014.service.ArticleService;

@Controller
@RequestMapping(value="/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	/**
	 * 首页文章标题加载 
	 * @param req code 文章类别   7、8、9 需要调用其他接口 请查询数据字典 /myweb/src/com/luox2014/util/Dictionary.java
	 * @return
	 */
	@RequestMapping(value="getTitle", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<Article> getArticleTitle(HttpServletRequest req){
		int code = Integer.parseInt(req.getParameter("code"));
		List<Article> retList;
		switch (code) {
		case 7:
			//文章更新
			retList = articleService.queryArticleTop(10);
			break;

		default:
			retList = articleService.queryArticle(code, 10, "ART_Create_Time");
			break;
		}
		
		return retList;
	}
	
	
	/**
	 *  跳转博客页面
	 * //向前端返回值 可以通过request 或者 ModelAndView
	 * @param req
	 * @return
	 */
	@RequestMapping(value="getBlog")
	public ModelAndView getBlogHtml(HttpServletRequest req){
		
		List<Article> list = articleService.queryArticleTop(10);
		ModelMap model = new ModelMap();
		model.addAttribute("articleList", list);
		
		return new ModelAndView("/blog/blog",model);
	}
	
	/**
	 * 跳转文章详情页面
	 * @return
	 */
	@RequestMapping(value="getBlogDtl")
	public ModelAndView getBlogContent(HttpServletRequest req){
		String id = req.getParameter("id");
		Article article = articleService.queryArticleById(id);
		ModelMap model = new ModelMap();
		model.put("article", article);
		return new ModelAndView("/blog/article",model);
		
	}
	
	/**
	 * 保存文章
	 * @param req
	 * @return
	 */
	@RequestMapping(value="saveBlog", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public String saveArticle(HttpServletRequest req){
		Article article = new Article();
		article.setAuthor(req.getParameter("author"));
		article.setContent(req.getParameter("content"));
		java.sql.Date date=new java.sql.Date(new java.util.Date().getTime()); 
		article.setDate(date);
		article.setMark(Integer.parseInt(req.getParameter("mark")));
		article.setTitle(req.getParameter("title"));
		
		return articleService.saveArticle(article);
	}
	

}
