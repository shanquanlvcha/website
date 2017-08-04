<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
<head>
<title>联系人页面测试</title>
 <base href="<%=basePath%>"/> 
<style> 
.table-a table{border:1px solid #F00} 
/* css注释：只对table标签设置红色边框样式 */ 
.table-b table th,td{border:1px solid #F00} 
</style> 

</head>
<body>
	<div  align="center">
		<p>联系人列表</p>
	</div>
	<%= basePath%>
	<div class="table-a table-b" align="center">
		<form action="contacts/list" method = "post"> 
			<table  width="600" border="1" cellspacing="0" cellpadding="0" > 
				<thead>
					<tr>
						<th>联系人ID</th>	
						<th>姓名</th>
						<th>性别</th>
						<th>联系地址</th>
						<th>联系方式</th>
						<th>QQ号码</th>	
						<th>操作</th>			
					</tr>
				</thead>
				<tbody>
					<c:forEach var="contact" items="${contacts}">
						<tr>
							<td>${contact.contactid}</td>
							<td>${contact.rolename}</td>
							<td>${contact.gender}</td>
							<td>${contact.address}</td>
							<td>${contact.phonenum}</td>
							<td>${contact.qqnumber}</td>
							<td>
								<input type="button" value="修改" onclick="location.href='toupdate?contactid=${contact.contactid}';">
						     	<input type="button" value="删除" onclick="todelete(${contact.contactid});">
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div align = "center">
				<input type="submit" value="查询">
				<input type="button" value="增加" onclick="top.location.href='<%= basePath%>/JSP/bkmgr/addcontact.jsp';">
			</div>		
		</form>
	</div>
</body>
<script type="text/javascript">
	function todelete(id){
		var r=confirm("确定删除联系人吗？");
		if(r==true){
			location.href="delete?contactid="+id;
		}
		
	}

</script>
</html>