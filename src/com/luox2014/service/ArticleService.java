package com.luox2014.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.luox2014.bean.Article;

public interface ArticleService {
            
	/**
	 * //通过id获取对象
	 * @param article_id
	 * @return
	 */
	public Article queryArticleById(String id);
           
	/**
	 * //通过mark  、 日期排序、选择前几行
	 * @param mark
	 * @param num
	 * @param sort
	 * @return
	 */
	public List<Article> queryArticle(int mark,int num,String sort);
	
	
	/**
	 * //根据日期获取前几条日志
	 * @param sum 条数
	 * @return
	 */
	public List<Article> queryArticleTop(int sum);
	
	/**
	 * 保存文章
	 * @param article
	 * @return
	 */
	public String saveArticle(Article article);
  
}