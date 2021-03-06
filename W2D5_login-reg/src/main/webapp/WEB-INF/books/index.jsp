<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<h1>All Books!</h1>
	<a href="/books/new">create new book</a>
	<hr />
	<p>${alldabooks }</p>
	<hr />

	<p style="background-color: teal; color: white">
		${delete_success }
	</p>
	<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Author</th>
					<th>pages</th>
					<th>Library</th>
					<th>actions</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${alldabooks }" var="b">
					<tr>
						<td>${b.id }</td>
						<td><a href="/books/${b.id}">${b.getTitle() }</a></td>
						<td>${b.author.userName }</td>
						<td>${b.pages }</td>						
						<td>${b.library.name }</td>						
						<td>
						
						<c:if test="${user_id eq b.author.id }">

								<a href="/books/${b.id }/edit">edit book</a>



								<form action="/books/${b.id}/delete" method="post"
									class="form-inline">
									<input type="hidden" name="_method" value="delete"> <input
										class="" type="submit" value="Delete">
								</form>
						</c:if>
						</td>
					
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr />
</div>

</body>
</html>