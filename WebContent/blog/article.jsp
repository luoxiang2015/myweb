<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/myweb/resources/css/1.css">
<link rel="stylesheet" type="text/css" href="/myweb/resources/css/2.css">
<script type="text/javascript" src="/myweb/resources/js/ScrollPic.js"></script>
<script type="text/javascript" src="/myweb/resources/js/jquery-1.8.2.min.js"></script>
<title>文章详情</title>
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
			${article.content }

		</div>
		
		<%@ include file="/resources/jsp/footer.jsp" %>
	
	</div>
</body>
</html>