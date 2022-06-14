<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Tacos</title>
</head>
<body>
	<h1>all books</h1>
	${allDaBooks }
	<hr />
	<p>
		<c:forEach items="${allDaBooks }" var="b">
			<li>
			${b.id } -- 
				<c:out value="${b.title }"/>
			</li>


		</c:forEach>
	</p>
</body>
</html>