<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- 导入jstl 标签库 -->
<%@ include file="/resources/jsp/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/myweb/resources/css/1.css">
<link rel="stylesheet" type="text/css" href="/myweb/resources/css/2.css">
<script type="text/javascript" src="/myweb/resources/js/ScrollPic.js"></script>
<script type="text/javascript" src="/myweb/resources/js/jquery-1.8.2.min.js"></script>
<title>小罗的个人博客-我的博客</title>
</head>
<body>
<%@ include file="/resources/jsp/head.jsp" %>
	<div id="main">
		
		<h1>日志</h1>
		<!-- left start -->
		<div id="sidebar">
		<a>左侧文章导航</a>
		</div>
		<!-- left end -->
		<!-- content start -->
		<div id="content">
			
			<div class="artlist"> 
				<ul>
				<c:forEach var="model" items="${articleList}">
				<li>
						<h3> <a> ${model.title } </a></h3>
						<span>${model.date }</span>
						<span>${model.author }</span>
						<span>${model.content }</span>
						
					</li>
				</c:forEach>
				
				</ul>
				
				<div class="pager">
    
			    <a href="blog.jsp?pageNum=0">上一页</a>
			    
			     <span class="now-page">1</span>
			    
			    	<a href="blog.jsp?pageNum=2">2</a>
			    
			    	<a href="blog.jsp?pageNum=3">3</a>
			    
			    	<a href="blog.jsp?pageNum=4">4</a>
			    
			    	<a href="blog.jsp?pageNum=5">5</a>
			    
			    <a href="blog.jsp?pageNum=2">下一页</a>
			    </div>
				
			
			</div>
		
			
			

		</div>
		
		<%@ include file="/resources/jsp/footer.jsp" %>
	
	</div>
	

	
	
</body>
</html>