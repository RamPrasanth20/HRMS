<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >

<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
		  <a class="navbar-brand" href="<s:url action='emp_home'/>">Home</a>
	</nav>
	
	<h2>Submit Leave Form</h2>
	<s:form action="reqLeaveForm">
		<div class="form-group">
		    <label for="start_date">Start Date</label>
		    <input type="date" name="start_date" class="form-control">
		</div>
		
		<div class="form-group">
		    <label for="end_date">Start Date</label>
		    <input type="date" name="end_date" class="form-control">
		</div>
		
		<div class="form-group">
			<s:textfield name="reason" class="form-control">Enter Reason</s:textfield>
		</div>
		<s:submit value="Request Leave" class="btn btn-primary"></s:submit>
	</s:form>
	
	<br>
	<br>
	<h2>The Your leave requests are as follows,</h2>
	
	
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th> Start Date</th>
					<th> End Date</th>
					<th>No of Days</th>
					<th>Reason</th>
					<th>Leave Status</th>
				</tr>
			</thead>
			
			<tbody>
				<s:iterator value="res">
					<tr scope="row">
						<th><s:property value="start_date"/></th>
						<th><s:property value="end_date"/></th>
						<th><s:property value="no_days"/></th>
						<th><s:property value="reason"/></th>
						<th><s:property value="leave_status"/></th>
					</tr>
				</s:iterator>
			</tbody>
			
		</table>
	
	<h1></h1>
	
	
	
	
</body>
</html>