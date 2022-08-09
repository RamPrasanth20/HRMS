package com.StrutsTest1;

import java.util.ArrayList;

import com.Dao.AttendanceDao;
import com.Model.Employee;

public class AttendDetailEmp {
	
	private ArrayList<Employee> res;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
		setRes(new AttendanceDao().getDateTime(getName()));
		return "success";
	}
}
