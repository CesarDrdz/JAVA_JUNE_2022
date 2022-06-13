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
	<h1>RESULTS</h1>
	<h3>${cool }</h3>
	<hr />
	name: ${name } <br />
	powerLevel: ${ powerLevel}
	<c:if test="${powerLevel gt 10000 }">
		<h5>you are a true hero!</h5>
	</c:if>
	<hr />
	powerlevel? ${tooLow }
	
</body>
</html>