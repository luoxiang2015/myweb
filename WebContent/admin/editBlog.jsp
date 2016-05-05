<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>日志管理</title>
</head>
<body>
  标题
    <input id="articleTitle" value=""/>
    作者
    <input id="articleAuthor"  value=""/>
    分类
    <input id="articleMarkqq" value=""/>
    
    <!-- 加载编辑器的容器 -->
    <script id="container" name="content" type="text/plain">
        这里写你的初始化内容
    </script>
    <script type="text/javascript" src="/myweb/resources/js/jquery-1.8.2.min.js"></script>
    <!-- 配置文件 -->
    <script type="text/javascript" src="/myweb/resources/jsp/ueditor/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="/myweb/resources/jsp/ueditor/ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
        var ue = UE.getEditor('container', {
            autoHeight: false
        });
    </script>
	<div id="btns">
		<button onclick="submit()">提交文本</button>
	</div>
	
	<script type="text/javascript">
	
	function submit(){
       //var content =  UE.getEditor('container').getContent();
       // alert(content);
        $.ajax(
        {
        	url:"/myweb/article/saveBlog.do",
        	type:"post",
        	data:{
        		author:$("#articleAuthor").val(),
        		markqq : $("#articleMarkqq").val(),
        		title: $("#articleTitle").val(),
        		content:UE.getEditor('container').getContent()
        			
        	},
        	dateType:"json",
        	success:function(data){
        		alert(data);
        	}
        	
        }		
        )
	}
	</script>
	
</body>
</html>