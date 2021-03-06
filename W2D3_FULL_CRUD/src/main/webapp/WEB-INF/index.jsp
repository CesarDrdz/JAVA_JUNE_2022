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
		<h1>All books</h1>
		<a href="/books/new">/books/new</a>
		<hr />
		${allDaBooks }
		<h5>${deleteSuccess }</h5>
		<table>
			<thead>
				<tr>
					<td>ID</td>
					<td>title</td>
					<td>Author</td>
					<td>pages</td>
					<td>Actions</td>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allDaBooks }" var="b">

					<tr>
						<td>${b.getId()}</td>
						<td><a href="/books/${b.getId() }"> ${b.getTitle() } </a></td>
						<td>${b.author }</td>
						<td>${b.pages }</td>
						<td><a href="/books/${b.getId()}/edit">edit</a> |

 							<form action="/books/${b.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form> 
							<!-- NEVER GO A GET FOR A DELETE -->
							<%-- <a href="/books/${b.id}/delete">delete book</a> --%>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>

<script>

</script>
</body>
</html>