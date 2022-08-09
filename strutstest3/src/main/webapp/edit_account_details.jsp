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
	  <a class="navbar-brand" href="<s:url action='emp_home'/>">Home</a>
	</nav>
	
	<h1>Edit Account Detail </h1>
	
	
	<s:iterator value="empdata">
		<s:form action="editAccount">
			<input type="hidden" name="emp_id" value=<s:property value="emp_id"/> >
			<h2>Personal Details</h2>
			<p>Employee id : <b><s:property value="emp_id"/></b><br></p>
			<p>Your Name : <b><input type="text" value="<s:property value="emp_username"/>" name="emp_username"></b><br></p>
			<p>Your Email : <b><input type="text" value="<s:property value="email"/>" name="email"></b><br></p>
			<p>Your Phone : <b><input type="text" value="<s:property value="ph_no"/>" name="ph_no"></b><br></p>
			<p>Your Account Password : <b><input type="text" value="<s:property value="passwrd"/>" name="passwrd"></b><br></p>
			
			
			<h2>Job Details</h2>
			<p>Department Id : <b><s:property value="dept_id"/></b><br></p>
			<p>Department Name : <b><s:property value="dept_name"/></b><br></p>
			<p>HR Name : <b><s:property value="hr_id"/></b><br></p>
			<p>Manager Name : <b><s:property value="manager_name"/></b><br></p>
			<p>Job Designation : <b><s:property value="job_designation"/></b><br></p>
			<p>Daily No of Working Hours : <b><s:property value="attendance_threshold"/></b><br></p>
			<p>Date of Joining : <b><s:property value="date_joined"/></b><br></p>
			
			
			<h2>Banking Details</h2>
			<p>Bank Name : <b><input type="text" value="<s:property value="bank_name"/>" name="bank_name"></b><br></p>
			<p>Bank Account No : <b><input type="text" value="<s:property value="bank_acc_no"/>" name="bank_acc_no"></b><br></p>
			<p>Bank IFSC code : <b><input type="text" value="<s:property value="bank_ifsc"/>" name="bank_ifsc"></b><br></p>
			
			
			<h1><s:submit value="Save Changes" class="btn btn-primary mb-2"></s:submit></h1>
		</s:form>
	</s:iterator>
</body>
</html>