package com.StrutsTest1;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.Dao.LoginDao;
import com.Model.LoginData;

public class Login implements SessionAware {
	
	private String uname;
	private String psw;
	private String msg;
	
	private SessionMap<String, Object> sessionMap;
	
	
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

	
	@Override
	public void setSession(Map<String, Object> map)
	{
		sessionMap = (SessionMap<String, Object>)map;
	}
	
	public String execute()
	{
		LoginData lg_data = new LoginData();
		lg_data.setUname(getUname());
		lg_data.setPswd(getPsw());
		
		LoginDao lg_dao = new LoginDao();
		boolean res = lg_dao.ValidateLogin(lg_data);
		if (res==true)
		{
			sessionMap.put("username", getUname());
			return "success";
		}
		setMsg("Invalid Username or password");
		return "error";
	}
	
	public String Logout()
	{
		if (sessionMap!=null)
			sessionMap.invalidate();
		return "success";
	}
	
	public String goHome()
	{
		return "success";
	}
	
	public String signUpPage()
	{
		return "success";
	}
}
