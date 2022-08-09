<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<s:property value="msg" default=""/> 
<s:form action="login" >

    <s:label for="uname"><b>Login</b></s:label>
    <s:textfield name="uname" label="Enter Name"> </s:textfield>

    <s:password name="psw" label="Enter Password"> </s:password>

    <s:submit value="login"></s:submit>


</s:form>
<br>
<br>
<s:form action="/Signup.jsp">
	<p>New user?</p><s:submit value="Sign Up"></s:submit>
</s:form>


<s:form action="employee_portal">
	<p>To open employee portal click here</p><s:submit value="Employee Portal"></s:submit>
</s:form>

</body>
</html>