package com.StrutsTest1;

import com.Dao.SignupDao;
import com.Model.SignupData;

public class Signup {
	
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
		SignupData sig_data = new SignupData(getUname(),getPsw());
		boolean res = new SignupDao().Validate(sig_data);
		
		if (res)
		{	
			setMsg("SignUp successfull");
			return "success";
		}
		setMsg("User Already Exist");
		return "error";
	}
}
