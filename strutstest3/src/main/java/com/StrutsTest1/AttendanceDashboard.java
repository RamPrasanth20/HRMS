package com.StrutsTest1;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.Dao.AttendanceDao;
import com.Model.Employee;

public class AttendanceDashboard {
	public ArrayList<Employee> res;
	
	
	public ArrayList<Employee> getRes() {
		return res;
	}


	public void setRes(ArrayList<Employee> res) {
		this.res = res;
	}


	public String execute()
	{
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		String username = (String) session.getAttribute("username");
		ArrayList<Employee> res = new AttendanceDao().getDateTime(username);
		setRes(res);
		
		if (new AttendanceDao().isCheckedin(username))
			return "error";
		return "success";
	}
}
