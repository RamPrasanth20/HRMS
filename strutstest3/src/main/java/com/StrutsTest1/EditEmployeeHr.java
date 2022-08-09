package com.StrutsTest1;

import com.Dao.GetEmpDetailsDao;
import com.Model.EmployeeDetailData;

public class EditEmployeeHr {
	
	private String emp_id;
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	private EmployeeDetailData[] empdata;
	public EmployeeDetailData[] getEmpdata() {
		return empdata;
	}


	public void setEmpdata(EmployeeDetailData[] empdata) {
		this.empdata = empdata;
	}

	public String execute()
	{
		
		EmployeeDetailData emp = new GetEmpDetailsDao().getEmployeeDetails(getEmp_id());
		
		if (emp == null)
			return "error";
		
		EmployeeDetailData empdata[] = {emp};
		setEmpdata(empdata);
		return "success";
		
	}
	
}
