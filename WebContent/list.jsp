<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
<%@ include file="/styles.jsp"%>
</head>
<body>
	<% 
	Date today = new Date(); 
	SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MMM dd");
	String formatedToday = DATE_FORMAT.format(today);
	%>
	<div class="box" id="heading">
	<h1><%= formatedToday %></h1>
	</div>
	
	<div class="box">
	
		<c:forEach items="${todolist}" var="todo">
		<div class="item">
			<p class="itemwidth">${todo.item}</p>
			<p>
			<a href="${pageContext.servletContext.contextPath}/delete?id=${todo.id}" class="abutton" >✓</a>
			</p>
		</div>	
		</c:forEach>
		
		<form class="item" method="POST" action="add">
		<input name="item" type="text" placeholder="New Item" autocomplete="off"/>
		<button name="list" type="submit" value="Save">+</button>
		</form>
	
	</div>

</body>
<footer>
  Created by T10 @XJTLU 2019
</footer>
</html>