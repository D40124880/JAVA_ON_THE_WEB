<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo JSP</title>
</head>
<body>
	<h1>Hello World</h1>
	
	<%!
	public int add(int a, int b){
		return a + b;
	}
	%>
	
	<% 
	int j = 2;
	int i = 4;
	%>
	
	<h3><%= add(i, j) %></h3>
	
	<% for(int index = 0; index < 5; index++) { %>
		<h1><%= index %></h1>
	<% } %>
	
	<h3>The time is: <%= new Date() %></h3>
</body>
</html>
