<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Attendance</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
		<a class="navbar-brand" href="<s:url action='emp_home'/>">Home</a>
		<div class="d-flex">
			<s:form action="check_out">
				<s:submit value="Check Out" class="btn btn-warning"></s:submit>
			</s:form>
		 </div>
	</nav>
	
	<br>
	<h3>Attendance details will be displayed below</h3>
	
	<s:iterator value="res">
	
		<p>On 
		<b><s:property value="Date"/></b>
		the time active was :
		<b><s:property value="SecActive" /></b>
		
		</p>
	
	<h1></h1>
	</s:iterator>
	
	
</body>
</html>