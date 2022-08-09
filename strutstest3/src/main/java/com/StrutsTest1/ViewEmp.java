package com.StrutsTest1;

import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import com.Dao.GetEmpDetailsDao;
import com.Model.Employee;

public class ViewEmp {
	
	private ArrayList<Employee> res;
	
	public ArrayList<Employee> getRes()
	{
		return res;
	}
	public void setRes(ArrayList<Employee> rest)
	{
		this.res = rest;
	}
	
	public String execute()
	{
		String hrname = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		
		res = new GetEmpDetailsDao().getNames(hrname);
		if (res==null)
			return "success";
		System.out.println(res.toString());
		setRes(res);
		return "success";
	}
}
