<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Player</title>
</head>
<body>
	<h1>Add a player to team <c:out value="${team.teamName}"/></h1>
	<form class='form' action="/TeamRoster/newPlayer?teamid=${teamidx}" method="POST">
		First Name: <input type="text" name="firstname"/>
		Last Name: <input type="text" name="lastname"/>
		Age: <input type="number" name="pAge"/>
		<input type="submit" value="Add">
	</form>
</body>
</html>