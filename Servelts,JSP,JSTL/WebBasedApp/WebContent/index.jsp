<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<c:set var = "x" value = "1234"></c:set>
		<c:out value="${x}"></c:out>
		
		<%-- this is as same the upper 
		JSP code without JSTl library
		<% int x= 300; %>
		<%= x %> --%>
	</body>
</html>