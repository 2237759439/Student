<%@page import="java.util.List"%>
<%@page import="entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
		<c:forEach var="s" items="${list}">
		<tr>
			<td>${s.nid }</td>
			<td>${s.name }</td>
			<td>${s.age }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>