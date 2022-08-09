package com.StrutsTest1;

import org.apache.struts2.ServletActionContext;

import com.Dao.EmployeeSignupDao;
import com.Model.SignupData;

public class CreateEmp {
private String uname,psw,msg;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String execute()
	{
		String hr_name = (String) ServletActionContext.getRequest().getSession(false).getAttribute("username");
		SignupData sig_data = new SignupData(getUname(),getPsw());
		boolean res = new EmployeeSignupDao().Validate(sig_data,hr_name);
		
		if (res)
		{	
			setMsg("SignUp successfull");
			return "success";
		}
		setMsg("User Already Exist");
		return "error";
	}
}
