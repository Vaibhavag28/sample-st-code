<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Leads here</title>
</head>
<body>
	<h2>All Leads</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
		</tr>
		<c:forEach var="allLeads" items="${allLeads}">
		<tr>
			<td><a href="leadInfo?id=${allLeads.id}">${allLeads.firstName}</td>
			<td>${allLeads.lastName}</td>
			<td>${allLeads.email}</td>
			<td>${allLeads.mobile}</td>
			<td>${allLeads.source}</td>		
		</tr>
		</c:forEach>
	</table>

</body>
</html>