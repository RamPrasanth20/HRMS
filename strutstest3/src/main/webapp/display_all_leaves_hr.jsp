<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Leave Request</title>
</head>
<body>
	
	
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
	  <a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
	</nav>
	<br>
	<blockquote class="blockquote text-center">
	  <h2 class="mb-0">HR Dashboard </h2>
	  <p class="mb-0"><b>Leave Requests</b></b></p>
	</blockquote>

		<table class="table table-striped table-hover">
			<thead class="thead-dark">
				<tr>
					<th>Employee_id</th>
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
						<td><s:property value="emp_id"/></td>
						<td><s:property value="start_date"/></td>
						<td><s:property value="end_date"/></td>
						<td><s:property value="no_days"/></td>
						<td><s:property value="reason"/></td>
						<td>
							<s:form action="setStatus" class="form-inline">
								<input type="hidden" value=<s:property value="leave_id"/> name="leave_id">
								<div class="dropdown">
								<select name="status" class="btn btn-secondary dropdown-toggle" >
									<option value="accepted" class="dropdown-item text-white">Accept</option>
									<option value="rejected" class="dropdown-item text-white">Reject</option>
									
								</select>
								</div>
								<s:submit value="Submit" class="btn btn-primary mb-2"></s:submit>
							</s:form>
						</td>
						
						
					</tr>
					
				</s:iterator>
			</tbody>
			
		</table>
	
</body>
</html>