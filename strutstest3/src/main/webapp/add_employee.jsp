<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Create New Employees</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>  
	
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
	  <a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
	</nav>
	
	
	<blockquote class="blockquote text-center">
	  <p class="mb-0">Create New Employees</p>
	</blockquote>

	<s:property value="msg" default=""/> 
	<s:form action="createEmp" >
		<div class="form-group">
	    	<s:textfield name="uname" label="Enter Name"> </s:textfield>
	    </div>
		<div class="form-group">
	    	<s:password name="psw" label="Enter Password"> </s:password>
		</div>
	    <s:submit value="Create User" class="btn btn-primary"></s:submit>
	</s:form>
	
	
	<br>
	<br>
	
</body>
</html>