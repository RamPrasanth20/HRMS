package com.Model;

public class EmployeeDetailData {

	private String emp_id,emp_username,passwrd,dept_id,dept_name,hr_id,manager_name,job_designation;
	private String attendance_threshold,date_joined,bank_name,bank_acc_no,bank_ifsc,email,ph_no;
	
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
	public String getHr_id() {
		return hr_id;
	}
	public void setHr_id(String hr_id) {
		this.hr_id = hr_id;
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
	
	
	public EmployeeDetailData(String emp_id,String emp_username,String passwrd,String dept_id,String dept_name,String hr_id,String manager_name , String job_designation, String attendence_threshold,String date_joined,String bank_name , String bank_acc_no , String bank_ifsc,String email,String ph_no )
	{
		this.emp_id = emp_id;
		this.emp_username = emp_username;
		this.passwrd = passwrd;
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.hr_id = hr_id;
		this.manager_name = manager_name;
		this.job_designation = job_designation;
		this.attendance_threshold = attendence_threshold;
		this.date_joined = date_joined;
		this.bank_name = bank_name;
		this.bank_acc_no = bank_acc_no;
		this.bank_ifsc = bank_ifsc;
		this.email = email;
		this.ph_no = ph_no;
		
	}
	public EmployeeDetailData() {
		// TODO Auto-generated constructor stub
	}
	
}
