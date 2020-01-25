<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Page</title>
	</head>
	<body>
		<h2 align = "center">LOGIN</h2>
		
		<h4 align = "center" style = "color: red"><c:out value="${message}"/></h4>
		<form action = "check.htm" method= "post"> 	
		<!-- WE CAN USE EITHER WAY <form action = "https://localhost:8080/WebBasedDemo/create.htm">  -->
			<table align = "center">
				<tr>
					<td>Username</td>
					<td><input type = "text" name= "username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type = "password" name= "password"></td>
				</tr>
				<tr>
					<td colspan = "2" align = "right"><input type = "reset" value= "clear">
													<input type = "submit" value= "login">
					</td>
					
				</tr>
			</table>		
		</form>
	</body>
</html>