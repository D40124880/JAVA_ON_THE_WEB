<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>League</title>
</head>
<body>
	
	<h1>League Listing</h1>
	<a href="/TeamRoster/TeamList"><button type="button">New Team</button></a>
	<div class="table">
		<table>
			<tr>
				<th>Team Name</th>
				<th>Player Count</th>
				<th>Actions</th>
			</tr>
				<c:forEach var='team' items="${teams}" varStatus="idx">
				<tr>
					<td><c:out value="${team.teamName}"/></td>
					<td><c:out value="${team.players.size()}"/></td>
					<td>
						<a href="/TeamRoster/Detail?teamid=${idx.index}"><button type="button">Details</button></a>
						<a href="/TeamRoster/deleteTeam?teamid=${idx.index}"><button type="button">Delete</button></a>
					</td>
				</tr>
				</c:forEach>
		</table>		
	</div>
	
</body>
</html>