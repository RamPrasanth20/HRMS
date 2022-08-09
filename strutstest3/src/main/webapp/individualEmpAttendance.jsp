<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
	  <a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
	</nav>
	<blockquote class="blockquote text-center">
	  <h2 class="mb-0">HR Attendance Dashboard </h2>
	  <p class="mb-0"><b>Employee - <s:property value="Name"/></b></b></p>
	</blockquote>
	
		<br>
	<br>
	<h1></h1>
	
	
	<s:iterator value="res">
		<div class="d-flex justify-content-center">
		<p>On <b><s:property value="Date"/></b>the time active was :<b><s:property value="SecActive" /></b>	</p>
		<br>
		<h1></h1>
		</div>
	</s:iterator>
	
	<br>

	
</body>
</html>