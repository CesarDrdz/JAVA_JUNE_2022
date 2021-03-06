<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tacos</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>UPDATE</h1>
		<a href="/books">/books</a>
		<p>x is ${x }</p>
		<form:form action="/books/${thisBook.id }" 
			method="post"
			modelAttribute="thisBook">

			<input type="hidden" name="_method" value="put">
			<p>
				<form:errors style="color: red" path="*" />
			</p>
			<p>
				Title
				<form:input path="title" />
			</p>
			<p>
				author
				<form:textarea path="author" />
			</p>
			<p>
				Pages
				<form:input type="number" path="pages" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>

	</div>
</body>
</html>