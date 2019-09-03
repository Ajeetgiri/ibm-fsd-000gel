<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CD</title>
</head>
<body>
<form action="controller.dao">
Title:<input type="text" name ="title" ><br>
Artist:<input type="text" name ="artist" ><br>
Purchase Date:<input type="date" name ="pd" ><br>
cost:<input type="text" name ="cost" ><br>
cdtype:<select name="type">
<option value="">UNKNOWN</option>
<option value="InternationalCD">International CD</option>
<option value="specialEditionCD">Special Edition CD</option>
</select><br>
<button type ="submit" name="SUBMIT" value="SUBMIT" >SUBMIT</button>
</form>
</body>
</html>