package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.Model.Employee;
import com.Model.EmployeeDetailData;
import com.Model.EmployeeSalaryData;




public class GetEmpDetailsDao {
	
	
	
	public ArrayList<Employee> getNames(String hr_name)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try 
	    {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
		
		
			String sql;
	        sql = "SELECT emp_id FROM emp_detail where hr_id= '"+hr_name+"'";
	        ResultSet rs = stmt.executeQuery(sql);
	        ArrayList<Employee> res = new ArrayList<Employee>(5);
	        while(rs.next())
	        {
	        	res.add(new Employee(rs.getString("emp_id")));
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	        return res;
	    }
	    
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
	}
	
	
	
	public ArrayList<String> getDetails(String emp_name)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try 
	    {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
		
		
			String sql;
	        sql = "SELECT * FROM emp_detail where emp_id='"+emp_name+"'";
	        ResultSet rs = stmt.executeQuery(sql);
	        ArrayList<String> res = new ArrayList<String>(5);
	        while(rs.next())
	        {
	        	res.add(rs.getString("emp_id"));
	        	res.add(rs.getString("emp_username"));
	        	res.add(rs.getString("passwrd"));
	        	res.add(rs.getString("dept_id"));
	        	res.add(rs.getString("dept_name"));
	        	res.add(rs.getString("hr_id"));
	        	res.add(rs.getString("manager_name"));
	        	res.add(rs.getString("job_designation"));
	        	res.add(rs.getString("attendance_threshold"));
	        	res.add(rs.getString("date_joined"));
	        	res.add(rs.getString("bank_name"));
	        	res.add(rs.getString("bank_acc_no"));
	        	res.add(rs.getString("bank_ifsc"));
	        	res.add(rs.getString("email"));
	        	res.add(rs.getString("ph_no"));
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	        return res;
	    }
	    
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
	}
	
	
	public EmployeeDetailData getEmployeeDetails(String emp_name)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    EmployeeDetailData emp = null;
	    
	    try 
	    {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
		
		
			String sql;
	        sql = "SELECT * FROM emp_detail where emp_id='"+emp_name+"'";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.next())
	        {
	        	
	        	emp = new EmployeeDetailData(rs.getString("emp_id"), 
	        			rs.getString("emp_username"), 
	        			rs.getString("passwrd"), 
	        			rs.getString("dept_id"), 
	        			rs.getString("dept_name"),
	        			rs.getString("hr_id"),
	        			rs.getString("manager_name"),
	        			rs.getString("job_designation"),
	        			rs.getString("attendance_threshold"),
	        			rs.getString("date_joined"), 
	        			rs.getString("bank_name"), 
	        			rs.getString("bank_acc_no"),
	        			rs.getString("bank_ifsc"),
	        			rs.getString("email"),
	        			rs.getString("ph_no"));
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	        return emp;
	    }
	    
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
		
	}
	
	public boolean updateEmpDetail(EmployeeDetailData emp)
	{
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try 
	    {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
		
		
			String sql;
	        sql = "update emp_detail set "
	        		+ "emp_username='"+emp.getEmp_username()+"',"
	        		+ "passwrd='"+emp.getPasswrd()+"',"
	        		+ "email='"+emp.getEmail()+"', "
	        		+ "ph_no='"+emp.getPh_no()+"', "
	        		+ "bank_name='"+emp.getBank_name()+"',"
	        		+ "bank_acc_no='"+emp.getBank_acc_no()+"',"
	        		+ "bank_ifsc='"+emp.getBank_ifsc()+"' where emp_id='"+emp.getEmp_id()+"'"
	        		;
	        stmt.executeUpdate(sql);
	        
	        stmt.close();
	        conn.close();
	        return true;
	    }
	    
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false;
	    }
	}
	
	
	
	public boolean updateEmpDetailHr(EmployeeDetailData emp)
	{
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try 
	    {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String att_tres = emp.getAttendance_threshold();
	    	//System.out.println("vadfasdfja is "+att_tres);
	    	if ((att_tres=="") )
	    	{
	    		att_tres=null;
	    	}
	    	String sql;
	    	String attndnc = emp.getDate_joined();
	    	if (attndnc=="")
	    	{
		        sql = "update emp_detail set "
		        		+ "emp_username='"+emp.getEmp_username()+"',"
		        		+ "passwrd='"+emp.getPasswrd()+"',"
		        		+ "email='"+emp.getEmail()+"', "
		        		+ "ph_no='"+emp.getPh_no()+"', "
		        		+ "dept_id='"+emp.getDept_id()+"',"
		        		+ "dept_name='"+emp.getDept_name()+"',"
		        		+ "manager_name='"+emp.getManager_name()+"',"
		        		+ "job_designation='"+emp.getJob_designation()+"',"
		        		+ "attendance_threshold= "+att_tres+","
		        		+ "date_joined=null,"
		        		+ "bank_name='"+emp.getBank_name()+"',"
		        		+ "bank_acc_no='"+emp.getBank_acc_no()+"',"
		        		+ "bank_ifsc='"+emp.getBank_ifsc()+"' where emp_id='"+emp.getEmp_id()+"';"
		        		;
	    	}
	    	else
	    	{
	    		sql = "update emp_detail set "
		        		+ "emp_username='"+emp.getEmp_username()+"',"
		        		+ "passwrd='"+emp.getPasswrd()+"',"
		        		+ "email='"+emp.getEmail()+"', "
		        		+ "ph_no='"+emp.getPh_no()+"', "
		        		+ "dept_id='"+emp.getDept_id()+"',"
		        		+ "dept_name='"+emp.getDept_name()+"',"
		        		+ "manager_name='"+emp.getManager_name()+"',"
		        		+ "job_designation='"+emp.getJob_designation()+"',"
		        		+ "attendance_threshold= "+att_tres+","
		        		+ "date_joined='"+emp.getDate_joined()+"',"
		        		+ "bank_name='"+emp.getBank_name()+"',"
		        		+ "bank_acc_no='"+emp.getBank_acc_no()+"',"
		        		+ "bank_ifsc='"+emp.getBank_ifsc()+"' where emp_id='"+emp.getEmp_id()+"';"
		        		;
	    	}
	        stmt.executeUpdate(sql);
	        
	        stmt.close();
	        conn.close();
	        return true;
	    }
	    
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false;
	    }
	}
	
	
	
	
	public EmployeeSalaryData getEmployeeSalaryDetails(String emp_name)
	{
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    EmployeeSalaryData emp = null;
	    
	    try 
	    {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
		
	    	emp = new EmployeeSalaryData();
	    	int curr_salary = 0;
	    	int salary_per_day = 0;
	    	int expense_amount = 0;
	    	int redn_salary = 0;
	    	
			String sql;
	        sql = "select sum(claim_amount) as amount from expense_detail where expense_status = 'accepted' and month(event_date) = month(curdate()) and emp_id='"+emp_name+"';";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.next())
	        {
	        	emp.setEmp_id(emp_name);
	        	emp.setExpense_amount(rs.getString("amount"));
	        	expense_amount = rs.getInt("amount");
	        }
	        
	        
	        sql = "select * from salary_detail where emp_id='"+emp_name+"';";
	        rs = stmt.executeQuery(sql);
	        if(rs.next())
	        {
	        	emp.setBase_salary(rs.getString("base_salary"));
	        	curr_salary = rs.getInt("base_salary");
	        	salary_per_day = curr_salary/30;
	        }
	        
	        
	        stmt = conn.createStatement();
	        sql = "select sum(datediff(end_date,start_date)+1) as datediff from leave_detail where emp_id = '"+emp_name+"' and leave_status='accepted';";
	        rs = stmt.executeQuery(sql);
	        if (rs.next())
	        {
	        	redn_salary = rs.getInt("datediff")*salary_per_day;
	        	
	        	emp.setLeave_amount(Integer.toString(redn_salary));
	        }
	        rs.close();
	        stmt.close();
	        
	        int base_salary_this_month = curr_salary + expense_amount - redn_salary;
	        emp.setCurr_salary(Integer.toString(base_salary_this_month));
	        
	        conn.close();
	        return emp;
	    }
	    
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return null;
	    }
		
	}
	
	
	public boolean updateSalaryDetail(String emp_id,String base_salary)
	{
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try 
	    {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
		
		
			String sql;
	        sql = "update salary_detail set "
	        		+ "base_salary="+base_salary+" where emp_id='"+emp_id+"'"
	        		;
	        stmt.executeUpdate(sql);
	        
	        stmt.close();
	        conn.close();
	        return true;
	    }
	    
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false;
	    }
	}
	
}

