<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Attendance Dashboard</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
	  <a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
	</nav>
	
	<blockquote class="blockquote text-center">
	  <h2 class="mb-0">HR Attendance Dashboard</h2>
	</blockquote>
	<br>
	<br>
	<h1></h1>
	
	
	<s:iterator value="res">
	<div class="d-flex justify-content-center">
		<s:form action="empAttendDetail" class="form-inline" >
			<div class="form-group mb-2">
				<input type="text" readonly class="form-control-plaintext" id="staticEmail2" value="<s:property value="Name"/>">		
			</div>
			
			<input type="hidden" name="name" value=<s:property value="Name"/> >
			<s:submit value="View Attendance Details" class="btn btn-primary mb-2"></s:submit>
			
		</s:form>
	</div>
	<h1></h1>
	</s:iterator>
	
</body>
</html>