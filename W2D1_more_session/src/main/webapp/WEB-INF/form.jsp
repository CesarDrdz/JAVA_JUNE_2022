<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Tacos</title>
</head>
<body>
	<div class="container">
		<h1>FORM</h1>
		<hr />
			<h2>${powerError }</h2>
		<form action="/formSubmission" method="POST">
			<p>
				name: 
				<input name="name"/>
			</p>
			<p>
				powerLevel: 
				<input type="number" name="powerLevel"/>
			</p>
			
			<button>submit</button>
		</form>
	</div>
	
	
	
	
	
</body>
</html>