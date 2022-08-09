<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Employee Login</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<blockquote class="blockquote text-center">
	  <h2 class="mb-0">Employee Login</h2>
	</blockquote>
	
	<s:form action="employee_login" >
	  <div class="form-group">
	    <s:textfield name="uname" label="Enter Name" class="form-control"> </s:textfield>
	  </div>
	  <div class="form-group">
	    <s:password name="psw" label="Enter Password" class="form-control"> </s:password>
	  </div>
	  <s:submit value="login" class="btn btn-primary"></s:submit>
	</s:form>
	
	
</body>
</html>