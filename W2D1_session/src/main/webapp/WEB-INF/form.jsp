<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Login</h3>
    <form action="/processForm" method="post">
        Email:
        <input type="text" name="email">
        
        Password:
        <input type="password" name="password">
        
        <button>submit</button>
    </form>
</body>
</html>