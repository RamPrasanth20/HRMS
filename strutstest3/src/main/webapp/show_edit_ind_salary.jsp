<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Edit Salary Detail</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
	  <a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
	</nav>
	
	<h1>Edit Salary Detail </h1>
	
	
	<s:iterator value="saldt">
		<s:form action="submitSalaryDetail">
			<input type="hidden" name="emp_id" value=<s:property value="emp_id"/> >
			<h2>Salary Details</h2>
			<p>Employee id : <b><s:property value="emp_id"/></b><br></p>
			<p>Base Salary : <b><input type="text" value="<s:property value="base_salary"/>" name="base_salary"></b><br></p>
			<p>Leave Reduction Amount : <b><s:property value="leave_amount"/></b><br></p>
			<p>Expense Amount(This Month) : <b><s:property value="expense_amount"/></b><br></p>
			<p>Final Salary(Current Month): <b><s:property value="curr_salary"/></b><br></p>
			
			<h1><s:submit value="Save Changes" class="btn btn-primary mb-2"></s:submit></h1>
		</s:form>
	</s:iterator>
</body>
</html>