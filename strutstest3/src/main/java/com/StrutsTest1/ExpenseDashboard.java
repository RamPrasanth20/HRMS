package com.StrutsTest1;

import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import com.Dao.LeaveExpenseDoa;
import com.Model.ExpenseData;

public class ExpenseDashboard {
	
	
	private ArrayList<ExpenseData> res;
	
	public ArrayList<ExpenseData> getRes() {
		return res;
	}

	public void setRes(ArrayList<ExpenseData> res) {
		this.res = res;
	}

	public String execute()
	{
		
		String emp_id = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		ArrayList<ExpenseData> result = new LeaveExpenseDoa().getExpense(emp_id);
		setRes(result);
		return "success";
	}

		
	
	
	private String date,claim_amount,reason;
	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClaim_amount() {
		return claim_amount;
	}

	public void setClaim_amount(String claim_amount) {
		this.claim_amount = claim_amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String sendRequest()
	{
		String emp_id = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		
		ExpenseData ex_dt = new ExpenseData();
		ex_dt.setEmp_id(emp_id);
		ex_dt.setEvent_date(getDate());
		ex_dt.setClaim_amount(getClaim_amount());
		ex_dt.setReason(getReason());
		ex_dt.setExpense_id("pending");
		
		new LeaveExpenseDoa().requestExpense(ex_dt);
		return "success";
		
	}
	
	
	
	
	public String displayExpReq()
	{
		
		String hr_id = (String)ServletActionContext.getRequest().getSession(false).getAttribute("username");
		ArrayList<ExpenseData> ld_list = new LeaveExpenseDoa().getAllExpenseReq(hr_id);
		setRes(ld_list);
		return "success";
	}
	
	
	
	
	
	
	
	private String status,expense_id;


	public String getExpense_id() {
		return expense_id;
	}

	public void setExpense_id(String expense_id) {
		this.expense_id = expense_id;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String setStatus()
	{
		String expense_id = getExpense_id();
		String emp_expense_status = getStatus();
		ExpenseData ld =new ExpenseData();
		ld.setExpense_id(expense_id);
		ld.setExpense_status(emp_expense_status);
		new LeaveExpenseDoa().setStatusExpenseData(ld);
		return "success";
		
	}

	
}
