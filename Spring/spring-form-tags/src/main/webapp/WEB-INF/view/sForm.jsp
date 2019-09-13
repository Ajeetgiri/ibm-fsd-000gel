<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName"/>
Last Name : <form:input path="lastname"/>
Country:
		
		<form:select path="country">
		
			<form:options items = "${student.countryOptions}" />
			
		</form:select>
				
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>
Operating Systems :

Linux<form:checkbox path="operatingSystems" value="Linux"/>
IOS<form:checkbox path="operatingSystems" value="IOS"/>
Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
Mac Window<form:checkbox path="operatingSystems" value="Mac Window"/>
<br><br>
<input type="submit">
</form:form>
</body>
</html>