<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Employee Details</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
	  <a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
	</nav>
	
	<blockquote class="blockquote text-center">
	  <p class="mb-0"><h2>List of employees are</h2></p>
	</blockquote>
	
	
	<br><br>
	
	<s:iterator value="res">
		<div class="d-flex justify-content-center">
			<s:form action="empDetail" class="form-inline">
			
				<div class="form-group mb-2">
					<input type="text" readonly class="form-control-plaintext" id="staticEmail2" value="<s:property value="Name"/>">
					
				</div>
				<input class="form-control-plaintext" type="hidden" name="name" value=<s:property value="Name"/> >
				<s:submit value="View Details" class="btn btn-primary mb-2"></s:submit>
		
			</s:form>
		<br>
		<br>
		</div>
	</s:iterator>
	
	<br>

</body>
</html>