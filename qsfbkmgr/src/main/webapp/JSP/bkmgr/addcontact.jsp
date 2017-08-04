<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8q">

<base href="<%=basePath%>"/> 

<title>增加联系人</title>
<style> 
.h1css{color:#F00} 
</style>
</head>
<body>
	<form action="contacts/add" method="post">
		<div align="center" >
			<h1 class="h1css">请输入联系人信息</h1>
		</div>
		<div align="center">
			联系人ID：<input type="text" name="contactid">
	    </div>
	    <div align="center">
	    	姓名：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="rolename">
	    </div>
	    <div align="center">
			性别：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="gender">    
		</div>
	    <div align="center">
	    	联系地址：<input type="text" name="address">
	    </div>
	    <div align="center">
	    	联系方式：<input type="text" name="phonenum">
	    </div>
	    <div align="center">
	    	QQ号码：&nbsp&nbsp<input type="text" name="qqnumber">
	    </div>
	    <div align="center">
	    	<input type="submit" value="增加">
	    	<input type="button" value="返回" onclick="history.go(-1);">
	    </div>
    </form>

</body>

</html>