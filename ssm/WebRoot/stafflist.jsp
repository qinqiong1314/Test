<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="utf-8">
    <title>2表分页显示</title>
	
  </head>
  
  <body>
  <h1>部门表跟员工表</h1>
     	<table border="1" >
		<tr>
			<th>雇员姓名</th>
			<th>雇员职位</th>
			<th>部门名称</th>
			<th>部门所在地</th>
			<th>员工工资</th>
		</tr>
		<c:forEach var="staff" items="${staffs }">
			<tr>
				<td>${staff.ename }</td>
				<td>${staff.job }</td>
				<td>${staff.dname }</td>
				<td>${staff.loc }</td>
				<td>${staff.sal }</td>
			</tr>
		</c:forEach>
		  		<tr>
  			<td colspan="5">
  				当前页：${page }|&nbsp;&nbsp;&nbsp;
  				<a href="staffController_find?page=${page-1 }&&rows=5">上一页</a>&nbsp;&nbsp;&nbsp;
  				<a href="staffController_find?page=${page+1 }&&rows=5">下一页</a>
  				&nbsp;&nbsp;&nbsp;&nbsp;总共：${total }条记录
  				
  			</td>
  		</tr>
	</table>	
  </body>
 
</html>