<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h2>Billing</h2>
	<form action="saveBill" method="post">
		<pre>
			First Name<input type="text" name="firstName" value="${contactById.firstName }">
			Last Name<input type="text" name="lastName" value="${contactById.lastName }">
			Email<input type="text" name="email" value="${contactById.email }">
			Mobile<input type="text" name="mobile" value="${contactById.mobile }">
			Product Name<input type="text" name="product"/>
			Quantity<input type="text" name="quantity" />
			Amount<input type="text" name="amount">
			
			<input type="submit" value="save">
		</pre>
	</form>

</body>
</html>