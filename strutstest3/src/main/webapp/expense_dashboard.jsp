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
	
	<h2>Submit Expense Form</h2>
	
	<s:form action="requestExpenseForm">
		<div class="form-group">
		    <label for="date">Event Date</label>
		    <input type="date" name="date" >

		</div>
		
		<div class="form-group">
		    <s:textfield name="claim_amount" label="Expense Amount in INR" class="form-control"></s:textfield>
		</div>
		
		<div class="form-group">
			<s:textfield name="reason" class="form-control" label="Provide the Reason" ></s:textfield>
		</div>
		<s:submit value="Request Reimbursement" class="btn btn-primary"></s:submit>
	</s:form>
	

	<br>
	<h2>The Your Expense requests are as follows,</h2>
	
	
		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th> Date</th>
					<th> Claim Amount</th>
					<th>Reason</th>
					<th>Expense Status</th>
				</tr>
			</thead>
			
			<tbody>
				<s:iterator value="res">
					<tr scope="row">
						<th><s:property value="event_date"/></th>
						<th><s:property value="claim_amount"/></th>
						<th><s:property value="reason"/></th>
						<th><s:property value="expense_status"/></th>
					</tr>
				</s:iterator>
			</tbody>
			
		</table>
	
	<h1></h1>
</body>
</html>