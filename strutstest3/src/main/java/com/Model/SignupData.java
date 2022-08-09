package com.Model;

public class SignupData {

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
	
	public SignupData(String uname,String passwd)
	{
		this.setUserName(uname);
		this.setPassword(passwd);
	}
}
