<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create New Account</h2>
	<form action="saveReg" method="post">
		<pre>
			FirstName<input type="text" name="firstName"/>
			LastName<input type="text" name="lastName"/>
			Email<input type="text" name="emailId"/>
			Password<input type="text" name="password">
			<input type="submit" value="save">
		</pre>
	</form>
</body>
</html>