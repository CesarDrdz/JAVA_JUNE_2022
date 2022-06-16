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
<title>Cool JAVA APP</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h1>Edit Book</h1>
	book id = ${book.id }
	<hr />
	<p>
		${book.library.name }
	</p>
	<form:form class="form border" action="/books/${book.id}" 
				method="post"
				modelAttribute="book">
				
		<input type="hidden" name="_method" value="put">
		
		<p>
			<form:label path="title">Title</form:label>
			<form:errors path="title" />
			<form:input path="title" placeholder="hi" />
		</p>
		<p>
			<form:label path="author">author</form:label>
			<form:errors path="author" />
			<form:textarea path="author" />
		</p>
		<p>
			<form:label path="pages">pages</form:label>
			<form:errors path="pages" />
			<form:input path="pages" />
		</p>	
		
		<%-- <input type="hidden" name="lib" value="${book.library.id}"/> --%>
		<!-- pass in the library of this book -->
		<form:hidden path="library" />
		
		<input type="submit" value="Submit" />
	</form:form>
</div>
</body>
</html>