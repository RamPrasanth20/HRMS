package com.Model;

public class EmployeeLoginData {
	private String UserName,Password;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public EmployeeLoginData(String uname,String passwd)
	{
		this.setUserName(uname);
		this.setPassword(passwd);
	}
}
