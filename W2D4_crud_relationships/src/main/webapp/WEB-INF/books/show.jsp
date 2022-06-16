<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cool JAVA APP</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h1>show book</h1>
		<hr />
		<a href="/books">/books</a>
		<p></p>
		
		<p>id: ${oneBook.id }</p>
		<h3>title: ${oneBook.title }</h3>
		<!-- <img src="http://placekitten.com/200/300" alt="kittens" /> -->
		<img src="http://placekitten.com/${random1}/${random2}" alt="kittens" />
		<p>Author: ${oneBook.author}</p>
		<p>pages: ${oneBook.getPages() }</p>
	</div>

</body>
</html>