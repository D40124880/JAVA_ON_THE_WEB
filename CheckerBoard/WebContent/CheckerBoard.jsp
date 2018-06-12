<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Checker Board</title>
<link rel="stylesheet" href="Style.css"> 
</head>
<body>
	<% int width = Integer.parseInt(request.getParameter("w")); %>
	<% int height = Integer.parseInt(request.getParameter("h")); %>
	<% int switchFlag = 1; %>
	<% int start = 1; %>
	
	<% for(int x = 0; x < height; x++) {%>
		<% for(int y = 0 ; y < width; y++) { %>
			<% if(switchFlag == 1) {%>
				<div class='green'><h1>A</h1></div>
				<% switchFlag = 2; %>
			<% } else if(switchFlag == 2) { %>
				<div class='red'><h1>b</h1></div>
				<% switchFlag = 1; %>
			<% } %>
		<% } %>
		<div class='stop'></div>
		<% if(start == 1) {%>
			<% switchFlag = 2; %>
			<% start = 2; %>
		<% } else if(start == 2) { %>
			<% switchFlag = 1; %>
			<% start = 1; %>
		<% } %>
	<% } %>
</body>
</html>
