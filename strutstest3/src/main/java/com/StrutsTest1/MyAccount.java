package com.StrutsTest1;

import org.apache.struts2.ServletActionContext;

import com.Dao.GetEmpDetailsDao;
import com.Model.EmployeeDetailData;

public class MyAccount {
	
	private EmployeeDetailData[] empdata;
	
	
	public EmployeeDetailData[] getEmpdata() {
		return empdata;
	}


	public void setEmpdata(EmployeeDetailData[] empdata) {
		this.empdata = empdata;
	}


	public String execute()
	{
		String username = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		
		EmployeeDetailData emp = new GetEmpDetailsDao().getEmployeeDetails(username);
		
		if (emp == null)
			return "error";
		
		EmployeeDetailData empdata[] = {emp};
		setEmpdata(empdata);
		return "success";
	}
	
	
	private String emp_id,emp_username,passwrd,email,ph_no,bank_name,bank_acc_no,bank_ifsc,hr_id;
	
	

	public String getHr_id() {
		return hr_id;
	}


	public void setHr_id(String hr_id) {
		this.hr_id = hr_id;
	}


	public String getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_username() {
		return emp_username;
	}


	public void setEmp_username(String emp_username) {
		this.emp_username = emp_username;
	}


	public String getPasswrd() {
		return passwrd;
	}


	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPh_no() {
		return ph_no;
	}


	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}


	public String getBank_name() {
		return bank_name;
	}


	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}


	public String getBank_acc_no() {
		return bank_acc_no;
	}


	public void setBank_acc_no(String bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}


	public String getBank_ifsc() {
		return bank_ifsc;
	}


	public void setBank_ifsc(String bank_ifsc) {
		this.bank_ifsc = bank_ifsc;
	}


	public String editAccount()
	{
		
		EmployeeDetailData emp =new EmployeeDetailData(getEmp_id(), 
    			getEmp_username(), 
    			getPasswrd(), 
    			null, 
    			null,
    			getHr_id(),
    			null,
    			null,
    			null,
    			null, 
    			getBank_name(), 
    			getBank_acc_no(),
    			getBank_ifsc(),
    			getEmail(),
    			getPh_no()
    			);
		if (new GetEmpDetailsDao().updateEmpDetail(emp))
			return "success";
		return "error";
	}
}
