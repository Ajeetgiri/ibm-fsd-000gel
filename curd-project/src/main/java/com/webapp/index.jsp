<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form id="form-1" action="controller.dao" method="post">
		<label for="input-1">First Name:</label>
		<input id="input-1" name="fname" type="text"/><br>
		<label for="input-2">Last Name:</label>
		<input id="input-2" name="lname" type="text"/><br>
		<label for="input-3">Email:</label>
		<input id="input-3" name="email" type="email"/><br>
		<input type="submit" value="Submit" id="button-1"/>
	</form>

</body>
</html>