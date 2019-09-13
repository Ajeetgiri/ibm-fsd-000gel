<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Detail</title>
</head>
<body>
First Name : ${student.getFirstName() }<br>
last Name  : ${student.getLastname() }<br>
Country    : ${student. getCountry() }<br>
Language   : ${student.getFavoriteLanguage() }<br>
Operating System : <c:forEach var="ajeet" items="${student.operatingSystems}"> ${ajeet}<br></c:forEach>
</body>
</html>