<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home page</title>
	</head>
	<body align = "center">
		<h3 align = "center">Welcome <c:out value="${user}"></c:out></h3>
		
		<a href = "getAll.htm" >Get Employees</a>
	</body>
</html>