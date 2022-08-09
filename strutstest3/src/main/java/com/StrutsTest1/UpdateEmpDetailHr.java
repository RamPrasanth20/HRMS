package com.StrutsTest1;

import com.Dao.GetEmpDetailsDao;
import com.Model.EmployeeDetailData;

public class UpdateEmpDetailHr {
	private String emp_username,passwrd,email,ph_no,bank_name,bank_acc_no,bank_ifsc,hr_id;
	private String dept_id,dept_name,manager_name,job_designation,attendance_threshold,date_joined;
	private String emp_id;

	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getJob_designation() {
		return job_designation;
	}
	public void setJob_designation(String job_designation) {
		this.job_designation = job_designation;
	}
	
	public String getHr_id() {
		return hr_id;
	}


	public void setHr_id(String hr_id) {
		this.hr_id = hr_id;
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


	public String execute()
	{
		System.out.println(getHr_id());
		System.out.println(getBank_acc_no());
		System.out.println(getEmp_id());
		System.out.println(getDept_id());
		System.out.println(getDept_name());
		System.out.println(getJob_designation());
		
		
		
		EmployeeDetailData emp =new EmployeeDetailData(getEmp_id(), 
    			getEmp_username(), 
    			getPasswrd(), 
    			getDept_id(), 
    			getDept_name(),
    			getHr_id(),
    			getManager_name(),
    			getJob_designation(),
    			getAttendance_threshold(),
    			getDate_joined(), 
    			getBank_name(), 
    			getBank_acc_no(),
    			getBank_ifsc(),
    			getEmail(),
    			getPh_no()
    			);
		if (new GetEmpDetailsDao().updateEmpDetailHr(emp))
			return "success";
		return "error";
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getAttendance_threshold() {
		return attendance_threshold;
	}
	public void setAttendance_threshold(String attendance_threshold) {
		this.attendance_threshold = attendance_threshold;
	}
	public String getDate_joined() {
		return date_joined;
	}
	public void setDate_joined(String date_joined) {
		this.date_joined = date_joined;
	}
}
