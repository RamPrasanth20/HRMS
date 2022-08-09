package com.StrutsTest1;

import com.Dao.GetEmpDetailsDao;
import com.Model.EmployeeDetailData;

public class DetailEmp {
	
	private String name;
	private EmployeeDetailData res;
	
	
	public EmployeeDetailData getRes() {
		return res;
	}
	public void setRes(EmployeeDetailData res) {
		this.res = res;
	}
	public String getName() {
		return name;
	}
	public void setName(String abc) {
		this.name = abc;
	}



	public String execute()
	{
		System.out.println("the emp is"+getName());
		EmployeeDetailData res = new GetEmpDetailsDao().getEmployeeDetails(getName());
		
		setRes(res);
		return "success";
	}
}
