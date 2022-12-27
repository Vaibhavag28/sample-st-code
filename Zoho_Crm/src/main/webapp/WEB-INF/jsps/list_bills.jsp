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
	<h2>Bill List</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Product</th>
			<th>Quantity</th>
			<th>Amount</th>
		</tr>
		<c:forEach var="allbills" items="${allbills}">
		<tr>
			<td>${allbills.firstName}</td>
			<td>${allbills.lastName}</td>
			<td>${allbills.email}</td>
			<td>${allbills.mobile}</td>
			<td>${allbills.product }</td>
			<td>${allbills.quantity }</td>
			<td>${allbills.amount }</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>