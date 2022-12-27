<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List</title>
</head>
<body>
	<h2>Contact List</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Billing</th>
		</tr>
		<c:forEach var="allContacts" items="${allContacts}">
		<tr>
			<td>${allContacts.firstName}</td>
			<td>${allContacts.lastName}</td>
			<td>${allContacts.email}</td>
			<td>${allContacts.mobile}</td>
			<td>${allContacts.source}</td>
			<td><a href="createBill?id=${allContacts.id}">billing</a></td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>