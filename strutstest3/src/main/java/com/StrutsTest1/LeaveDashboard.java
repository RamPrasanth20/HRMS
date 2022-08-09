package com.StrutsTest1;

import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import com.Dao.LeaveExpenseDoa;
import com.Model.LeaveData;

public class LeaveDashboard {

	private ArrayList<LeaveData> res;
	public ArrayList<LeaveData> getRes() {
		return res;
	}

	public void setRes(ArrayList<LeaveData> res) {
		this.res = res;
	}
	
	public String execute()
	{
		
		String emp_id = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		ArrayList<LeaveData> result = new LeaveExpenseDoa().getLeaves(emp_id);
		setRes(result);
		return "success";
	}
	
	
	
	private String start_date,end_date,reason;
	
	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String requestLeave()
	{
		String emp_id = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		
		LeaveData leavedt = new LeaveData();
		leavedt.setStart_date(getStart_date());
		leavedt.setEnd_date(getEnd_date());
		leavedt.setEmp_id(emp_id);
		leavedt.setReason(getReason());
		
		new LeaveExpenseDoa().requestLeave(leavedt);
		
		return "success";
		
	}
	
	
	
	
	
	public String displayLeaveReq()
	{
		
		String hr_id = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		ArrayList<LeaveData> ld_list = new LeaveExpenseDoa().getAllLeaveReq(hr_id);
		setRes(ld_list);
		return "success";
	}
	
	
	
	private String status,leave_id;
	
	
	public String getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(String leave_id) {
		this.leave_id = leave_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String setStatus()
	{
		String leave_id = getLeave_id();
		String emp_leave_status = getStatus();
		LeaveData ld =new LeaveData();
		ld.setLeave_id(leave_id);
		ld.setLeave_status(emp_leave_status);
		new LeaveExpenseDoa().setStatusData(ld);
		return "success";
		
	}
}
