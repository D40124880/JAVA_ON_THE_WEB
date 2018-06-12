<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Counting Number</title>
</head>
<body>
	<form action="/ButtonClicker/Button">
		<input type="submit" value="Click Me">
	</form>
	
	<br>
	<h5>You have clicked the button <%= (int) session.getAttribute("counter") %> times!</h5>
</body>
</html>
