<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Employee Salary Details</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>

	<s:iterator value="saldt">

		<nav class="navbar navbar-dark bg-primary justify-content-between">
			<a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
			<s:form class="d-flex" action="editSalaryPage">
					<input type="hidden" name="emp_id" value=<s:property value="emp_id"/> >
					<s:submit value="Edit" class="btn btn-warning"></s:submit>
			</s:form>
		</nav>
		
				
		<blockquote class="blockquote text-center">
	  		<h1 class="mb-0">Salary Info Account</h1>
		</blockquote>
		<h1></h1>
		<h1></h1>
		
		<h2>Salary Details</h2>
		<p>Employee id : <b><s:property value="emp_id"/></b><br></p>
		<p>Base Salary : <b><s:property value="base_salary"/></b><br></p>
		<p>Leave Reduction Amount : <b><s:property value="leave_amount"/></b><br></p>
		<p>Expense Amount(This Month) : <b><s:property value="expense_amount"/></b><br></p>
		<p>Final Salary(Current Month): <b><s:property value="curr_salary"/></b><br></p>
	</s:iterator>
</body>
</html>