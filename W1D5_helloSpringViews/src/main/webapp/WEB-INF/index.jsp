<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello</h1>
	<hr />
	<p>
		this is with c:out <c:out value="${someKey }" />
	</p>
	<hr />
		this is without c:out ${nums }
	
</body>
</html>