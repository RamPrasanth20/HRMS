<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>My Account</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>

	<s:iterator value="empdata">

		<nav class="navbar navbar-dark bg-primary justify-content-between">
		  <a class="navbar-brand" href="<s:url action='emp_home'/>">Home</a>
		  <div class="d-flex">
		  <a href="<s:url action='editAccountPage'/>" class="btn btn-warning">Edit</a>
		  </div>
		  
		</nav>
		
		<blockquote class="blockquote text-center">
	  		<h1 class="mb-0">My Account</h1>
		</blockquote>
		<h1></h1>
		<h1></h1>
		
		<h2>Personal Details</h2>
		<p>Employee id : <b><s:property value="emp_id"/></b><br></p>
		<p>Your Name : <b><s:property value="emp_username"/></b><br></p>
		<p>Your Email : <b><s:property value="email"/></b><br></p>
		<p>Your Phone : <b><s:property value="ph_no"/></b><br></p>
		<p>Your Account Password : <b><s:property value="passwrd"/></b><br></p>
		
		
		<h2>Job Details</h2>
		<p>Department Id : <b><s:property value="dept_id"/></b><br></p>
		<p>Department Name : <b><s:property value="dept_name"/></b><br></p>
		<p>HR Name : <b><s:property value="hr_id"/></b><br></p>
		<p>Manager Name : <b><s:property value="manager_name"/></b><br></p>
		<p>Job Designation : <b><s:property value="job_designation"/></b><br></p>
		<p>Daily No of Working Hours : <b><s:property value="attendance_threshold"/></b><br></p>
		<p>Date of Joining : <b><s:property value="date_joined"/></b><br></p>
		
		
		<h2>Banking Details</h2>
		<p>Bank Name : <b><s:property value="bank_name"/></b><br></p>
		<p>Bank Account No : <b><s:property value="bank_acc_no"/></b><br></p>
		<p>Bank IFSC code : <b><s:property value="bank_ifsc"/></b><br></p>
		

	</s:iterator>
</body>
</html>