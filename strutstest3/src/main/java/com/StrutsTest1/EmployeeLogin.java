package com.StrutsTest1;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.Dao.EmployeeLoginDao;
import com.Model.EmployeeLoginData;

public class EmployeeLogin implements SessionAware {
	
	private String uname,psw,msg;
	private SessionMap<String, Object> sessionMap;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

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
	
	
	@Override
	public void setSession(Map<String, Object> map)
	{
		sessionMap = (SessionMap<String, Object>)map;
	}
	
	
	public String execute()
	{
		
		EmployeeLoginData emp_log_dt = new EmployeeLoginData(getUname(),getPsw());
		boolean res = new EmployeeLoginDao().validate(emp_log_dt);
		if (res)
		{
			sessionMap.put("username", getUname());
			return "success";
		}
		setMsg("Invalid username or password");
		return "error";
	}
	
	public String Logout()
	{
		if (sessionMap!=null)
			sessionMap.invalidate();
		return "success";
	}
}
