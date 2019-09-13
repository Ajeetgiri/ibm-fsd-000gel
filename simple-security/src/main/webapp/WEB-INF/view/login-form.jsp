<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    	<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@page isELIgnored="false" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body>

<h1>Login Form</h1>
<hr>
	
	
			<!-- Tabs Titles -->

			<!-- Icon -->
			
				<c:if test="${param.error != null}">

									<div class="alert alert-danger col-xs-offset-1 col-xs-10">
										<h2 style="color:red">Invalid Credentials.....</h2>
									</div>					
				</c:if>
				<c:if test="${param.logout != null}">
										            
										<div class="alert alert-success col-xs-offset-1 col-xs-10">
											You have been logged out.
										</div>
								    
									</c:if>
			
<br>
			
			<!-- Login Form -->
			<form:form action="${pageContext.request.contextPath}/authenticateTheUser"  method="POST">
				<input type="text" id="login"  name="username" placeholder="username"> <br><br>
					
				<input type="password" id="password" name="password" placeholder="password"> <br><br>
					 
				<input
					type="submit"  value="Log In">
			</form:form>



</body>
</html>