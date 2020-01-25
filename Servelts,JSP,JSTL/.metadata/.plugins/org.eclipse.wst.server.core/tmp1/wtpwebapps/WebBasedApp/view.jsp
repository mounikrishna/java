<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Employees</title>
	</head>
	<body align = "center">
		<h3>ALL EMPLOYEES</h3>
		<table align = "center" border = "1">
			<tr>
				<th>E.No</th>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Gender</th>
				<th>Salary</th>
				<th>Username</th>
				
			</tr>
			<c:forEach var = "emp" items= "${employees}">
			<tr>
				<td><c:out value="${emp.getEno()}"/></td>
				<td><c:out value="${emp.getFirstname()}"/></td>
				<td><c:out value="${emp.getLastname()}"/></td>
				<td><c:out value="${emp.getGender()}"/></td>
				<td><c:out value="${emp.getSalary()}"/></td>
				<td><c:out value="${emp.getUsername()}"/></td>
				<td><a href="delete.htm?eno=${emp.getEno()}" onclick="return confirm('Are you sure?')"><img src= "images/delete.png" width = "20" height = "20"> </a></td>
			</tr>
			</c:forEach>  
		</table>
	</body>
</html>