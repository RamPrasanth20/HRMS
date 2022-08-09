<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Employee Dashboard</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<blockquote class="blockquote text-center">
	  <h2 class="mb-0">Employee Dashboard</h2>
	</blockquote>
	
	<h2>Welcome <s:property value="#session.username"/></h2>
	<br>
	<br>

	<div class="row">
	  <div class="col-sm-6">
	    <div class="card text-center" >
	      <div class="card-body">
	        <h5 class="card-title"><a href="<s:url action='myAccount'/>">My Account</a></h5>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-6">
	    <div class="card text-center" >
	      <div class="card-body">
	        <h5 class="card-title"><a href="<s:url action='attendanceDashboard'/>">Attendance</a></h5>
	      </div>
	    </div>
	  </div>
	</div>
	
	<div class="row">
	  <div class="col-sm-6">
	    <div class="card text-center" >
	      <div class="card-body">
	        <h5 class="card-title"><a href="<s:url action='requestLeave'/>">Request Leave</a></h5>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-6">
	    <div class="card text-center" >
	      <div class="card-body">
	        <h5 class="card-title"><a href="<s:url action='requestExpense'/>">Request Reimbursement</a></h5>
	      </div>
	    </div>
	  </div>
	</div>
	
	<div class="row">
	  <div class="col-sm-6">
	    <div class="card text-center" >
	      <div class="card-body">
	        <h5 class="card-title"><a href="<s:url action='requestSalaryEmp'/>">Salary Detail</a></h5>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-6">
	    <div class="card text-center" >
	      <div class="card-body">
	        <h5 class="card-title"><a href="<s:url action='employee_logout'/>">Log Out</a></h5>
	      </div>
	    </div>
	  </div>
	</div>
	
</body>
</html>