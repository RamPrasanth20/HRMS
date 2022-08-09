package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.Model.ExpenseData;
import com.Model.LeaveData;


public class LeaveExpenseDoa {
	
	public ArrayList<LeaveData> getLeaves(String emp_id)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    ArrayList<LeaveData> res = null;
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "SELECT *,datediff(end_date,start_date)+1 as date_diff FROM leave_detail where emp_id = '"+emp_id+"' and start_date>=curdate()";
	        ResultSet rs = stmt.executeQuery(sql);
	        res = new ArrayList<LeaveData>();
	        
	        while (rs.next())
	        {
	        	LeaveData ld = new LeaveData();
	        	ld.setStart_date(rs.getString("start_date"));
	        	ld.setEnd_date(rs.getString("end_date"));
	        	ld.setReason(rs.getString("reason"));
	        	ld.setNo_days(rs.getString("date_diff"));
	        	ld.setLeave_status(rs.getString("leave_status"));
	        	
	        	res.add(ld);
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
	    return res;
		
	}
	
	
	
	public boolean requestLeave(LeaveData leavedt)
	{
		
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "insert into leave_detail(emp_id,start_date,end_date,reason,leave_status) values ('"+leavedt.getEmp_id()+"', '"+leavedt.getStart_date()+"','"
	        		+ leavedt.getEnd_date()+"','"
	        		+leavedt.getReason() + "','pending'"
	        		+ ")";
	        stmt.executeUpdate(sql);
	        
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false;
	    }
		return true;
	}
	
	
	
	
	
	public ArrayList<LeaveData> getAllLeaveReq(String hr_id)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    ArrayList<LeaveData> res = null;
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "SELECT *,datediff(end_date,start_date)+1 as date_diff FROM leave_detail where start_date>=curdate() and leave_status='pending' and emp_id in (select emp_id from emp_detail where hr_id ='"+hr_id+"')";
	        ResultSet rs = stmt.executeQuery(sql);
	        res = new ArrayList<LeaveData>();
	        
	        while (rs.next())
	        {
	        	LeaveData ld = new LeaveData();
	        	ld.setLeave_id(rs.getString("leave_id"));
	        	ld.setEmp_id(rs.getString("emp_id"));
	        	ld.setStart_date(rs.getString("start_date"));
	        	ld.setEnd_date(rs.getString("end_date"));
	        	ld.setReason(rs.getString("reason"));
	        	ld.setNo_days(rs.getString("date_diff"));
	        	ld.setLeave_status(rs.getString("leave_status"));
	        	
	        	res.add(ld);
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
	    return res;
		
		
	}
	
	
	public boolean setStatusData(LeaveData ld)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "update leave_detail set leave_status='"+ld.getLeave_status()+"' where leave_id ="+ld.getLeave_id()+";";
	        
	        stmt.executeUpdate(sql);
	        
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false;
	    }
		return true;
		
	}
	
	
	public ArrayList<ExpenseData> getExpense(String emp_id)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    ArrayList<ExpenseData> res = null;
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "SELECT * FROM expense_detail where emp_id = '"+emp_id+"'";
	        ResultSet rs = stmt.executeQuery(sql);
	        res = new ArrayList<ExpenseData>();
	        
	        while (rs.next())
	        {
	        	ExpenseData ld = new ExpenseData();
	        	ld.setEvent_date(rs.getString("event_date"));
	        	ld.setReason(rs.getString("reason"));
	        	ld.setClaim_amount(rs.getString("claim_amount"));
	        	ld.setExpense_status(rs.getString("expense_status"));
	        	
	        	res.add(ld);
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
	    return res;
		
	}
	
	
	
	
	public boolean requestExpense(ExpenseData expensedt)
	{
		
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "insert into expense_detail(emp_id,event_date,claim_amount,reason,expense_status) values ('"+expensedt.getEmp_id()+"', '"+expensedt.getEvent_date()+"',"
	        		+ expensedt.getClaim_amount()+",'"
	        		+expensedt.getReason() + "','pending'"
	        		+ ")";
	        stmt.executeUpdate(sql);
	        
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false;
	    }
		return true;
	}
	
	
	
	public ArrayList<ExpenseData> getAllExpenseReq(String hr_id)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    ArrayList<ExpenseData> res = null;
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "SELECT * FROM expense_detail where expense_status='pending' and emp_id in (select emp_id from emp_detail where hr_id ='"+hr_id+"')";
	        ResultSet rs = stmt.executeQuery(sql);
	        res = new ArrayList<ExpenseData>();
	        
	        while (rs.next())
	        {
	        	ExpenseData ld = new ExpenseData();
	        	ld.setExpense_id(rs.getString("expense_id"));
	        	ld.setEmp_id(rs.getString("emp_id"));
	        	ld.setEvent_date(rs.getString("event_date"));
	        	ld.setClaim_amount(rs.getString("claim_amount"));
	        	ld.setReason(rs.getString("reason"));
	        	ld.setExpense_status(rs.getString("expense_status"));
	        	
	        	res.add(ld);
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
	    return res;
		
		
	}
	
	public boolean setStatusExpenseData(ExpenseData ld)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "update expense_detail set expense_status='"+ld.getExpense_status()+"' where expense_id ="+ld.getExpense_id()+";";
	        
	        stmt.executeUpdate(sql);
	        
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false;
	    }
		return true;
		
	}
	
}
