package com.StrutsTest1;

import org.apache.struts2.ServletActionContext;

import com.Dao.GetEmpDetailsDao;
import com.Model.Employee;
import com.Model.EmployeeSalaryData;

import java.util.ArrayList;


public class SalaryDashboard {
	
	private ArrayList<Employee> res;
	
	public ArrayList<Employee> getRes() {
		return res;
	}

	public void setRes(ArrayList<Employee> res) {
		this.res = res;
	}

	public String execute()
	{
		String hr_name = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		ArrayList<Employee> reslt = new GetEmpDetailsDao().getNames(hr_name);
		setRes(reslt);
		return "success";
	}
	
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private ArrayList<EmployeeSalaryData> saldt;
	
	
	public ArrayList<EmployeeSalaryData> getSaldt() {
		return saldt;
	}

	public void setSaldt(ArrayList<EmployeeSalaryData> saldt) {
		this.saldt = saldt;
	}

	public String showEmpSalary()
	{
		EmployeeSalaryData sd =  new GetEmpDetailsDao().getEmployeeSalaryDetails(getName());
		ArrayList<EmployeeSalaryData> esd = new ArrayList<EmployeeSalaryData>();
		esd.add(sd);
		setSaldt(esd);
		return "success";
	}

	
	private String emp_id;
	
	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String editSalaryPage()
	{
		EmployeeSalaryData sd =  new GetEmpDetailsDao().getEmployeeSalaryDetails(getEmp_id());
		ArrayList<EmployeeSalaryData> esd = new ArrayList<EmployeeSalaryData>();
		sd.setEmp_id(getEmp_id());
		esd.add(sd);
		setSaldt(esd);
		return "success";
	}
	
	
	private String base_salary;
	
	public String getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(String base_salary) {
		this.base_salary = base_salary;
	}
	
	public String setSalary()
	{
		new GetEmpDetailsDao().updateSalaryDetail(getEmp_id(),getBase_salary());
		return "success";
	}
	
	
	public String requestSalaryEmp()
	{
		String emp_name = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		EmployeeSalaryData sd =  new GetEmpDetailsDao().getEmployeeSalaryDetails(emp_name);
		ArrayList<EmployeeSalaryData> esd = new ArrayList<EmployeeSalaryData>();
		esd.add(sd);
		setSaldt(esd);
		return "success";
	}
	
}
