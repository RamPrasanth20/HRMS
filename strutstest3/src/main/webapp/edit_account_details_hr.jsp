<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Edit Account Detail</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s" %>
	
	<nav class="navbar navbar-dark bg-primary justify-content-between">
	  <a class="navbar-brand" href="<s:url action='hr_home'/>">Home</a>
	</nav>
	
	<h1>Edit Account Detail </h1>
	
	
	<s:iterator value="empdata">
		<s:form action="editAccountHr">
			<input type="hidden" name="emp_id" value=<s:property value="emp_id"/> >
			<h2>Personal Details</h2>
			<p>Employee id : <b><s:property value="emp_id"/></b><br></p>
			<p>Your Name : <b><input type="text" value="<s:property value="emp_username"/>" name="emp_username"></b><br></p>
			<p>Your Email : <b><input type="text" value="<s:property value="email"/>" name="email"></b><br></p>
			<p>Your Phone : <b><input type="text" value="<s:property value="ph_no"/>" name="ph_no"></b><br></p>
			<p>Your Account Password : <b><input type="text" value="<s:property value="passwrd"/>" name="passwrd"></b><br></p>
			
			
			<h2>Job Details</h2>
			
			<p>Dept ID : <b><input type="text" value="<s:property value="dept_id"/>" name="dept_id"></b><br></p>
			<p>Department Name : <b><input type="text" value="<s:property value="dept_name"/>" name="dept_name"></b><br></p>
			<p>HR Id : <b><s:property value="hr_id"/></b><br></p>
			<p>Manager Name : <b><input type="text" value="<s:property value="manager_name"/>" name="manager_name"></b><br></p>
			<p>Job designation : <b><input type="text" value="<s:property value="job_designation"/>" name="job_designation"></b><br></p>
			<p>Required Working Hours per Day : <b><input type="text" value="<s:property value="attendance_threshold"/>" name="attendance_threshold"></b><br></p>
			<p>Date of joining : <b><input type="date" value="<s:property value="date_joined"/>" name="date_joined"></b><br></p>
			
			
			<h2>Banking Details</h2>
			<p>Bank Name : <b><input type="text" value="<s:property value="bank_name"/>" name="bank_name"></b><br></p>
			<p>Bank Account No : <b><input type="text" value="<s:property value="bank_acc_no"/>" name="bank_acc_no"></b><br></p>
			<p>Bank IFSC code : <b><input type="text" value="<s:property value="bank_ifsc"/>" name="bank_ifsc"></b><br></p>
			
			
			<h1><s:submit value="Save Changes" class="btn btn-primary mb-2"></s:submit></h1>
		</s:form>
	</s:iterator>
	
</body>
</html>