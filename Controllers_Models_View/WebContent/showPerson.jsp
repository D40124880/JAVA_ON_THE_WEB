<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Showing Person</title>
</head>
<body>
	<h1><c:out value="${person.greeting()}"/></h1>
</body>
</html>

<%-- <c:forEach var="person" items="${people}">
    <c:out value="${person.name}"/>
</c:forEach> --%>