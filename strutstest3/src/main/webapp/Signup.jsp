<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<title>Sign Up</title>
<style>
		.bg{
		  background: -moz-linear-gradient(45deg, rgba(213, 15, 61, 0.6), rgba(13, 17, 198, 0.69) 100%);
		  background: -webkit-linear-gradient(45deg, rgba(213, 15, 61, 0.6), rgba(13, 17, 198, 0.69) 100%);
		  background: linear-gradient(to 45deg, rgba(213, 15, 61, 0.6), rgba(13, 17, 198, 0.69) 100%);
		}
		@media (max-width: 740px) {
		  html,
		  body,
		  header,
		  .view {
		    height: 100vh;
		  }
		}
</style>
</head>
<body class="bg">

	<%@ taglib uri="/struts-tags" prefix="s" %>  
	
		<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	
	<div class="d-flex justify-content-center bd-highlight">
		<div class="p-2 bd-highlight">
			<p class="text-white"><s:property value="msg" default=""/></p> 
			<h1 class="text-white">HR SIGN UP</h1>
			<s:form action="signup">
			  <div class="form-group">
			    <label class="text-white" for="uname">User Id</label>
			    <input type="text" class="form-control" name="uname" placeholder="Enter User Id">
			  </div>
			  <div class="form-group">
			    <label class="text-white" for="psw">Password</label>
			    <input type="password" class="form-control" name="psw" placeholder="Password">
			  </div>
			  <s:submit value="Register" class="btn btn-primary"></s:submit>
			</s:form>
		</div>
	</div>
	
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	<div class="d-flex justify-content-center bd-highlight"><div class="p-2 bd-highlight"> </div></div>
	




</body>
</html>