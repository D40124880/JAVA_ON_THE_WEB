<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Input Pet Animal</title>
</head>
<body>
	<div class="wrapper">
		<div class="dog">
			<form class="form" action="/Pets/dog">
				<h3>Name: <input type="text" name="name"></h3>
				<h3>Breed: <input type="text" name="breed"></h3>
				<h3>Weight(lb): <input type="number" name="weight"></h3>
				<input type="submit" value="Submit">
			</form>
		</div>
		
		<div class="cat">
			<form class="form" action="/Pets/cat">
				<h3>Name: <input type="text" name="name"></h3>
				<h3>Breed: <input type="text" name="breed"></h3>
				<h3>Weight(lb): <input type="number" name="weight"></h3>
				<input type="submit" value="Submit">
			</form>
		</div>
	</div>
</body>
</html>
