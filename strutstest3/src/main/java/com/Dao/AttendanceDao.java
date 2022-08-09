package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.Model.Employee;

public class AttendanceDao {
	

	public boolean checkin(String username)
	{
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	        
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        LocalDateTime now = LocalDateTime.now();
	        String curr_time = dtf.format(now);
	        
	        String sql;
	        sql = "SELECT hr_id FROM emp_detail where emp_id = '"+username+"'";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.next();
	        String hr_id = rs.getString("hr_id");
	        
	        
	        sql = "INSERT INTO attendance_detail(emp_id,hr_id,check_in) values ('"+username+"' , '"+hr_id+"' , '"+curr_time+"')";         
	        stmt.executeUpdate(sql);
	        
	        rs.close();
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
	
	public boolean checkout(String username)
	{
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	        
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        LocalDateTime now = LocalDateTime.now();
	        String curr_time = dtf.format(now);
	        
	        String sql;
	        sql = "SELECT att_id FROM attendance_detail where emp_id = '"+username+"' and check_out is null";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.next();
	        
	        String att_id = rs.getString("att_id");
	        
	        
	        
	        
	        sql = "update attendance_detail set check_out = '"+curr_time+"' where att_id = "+att_id;         
	        stmt.executeUpdate(sql);
	        
	        rs.close();
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
	
	
	
	
	
	public boolean  isCheckedin(String username)
	{
		
		boolean res = false;
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();

	        String sql;
	        sql = "SELECT emp_id FROM attendance_detail where emp_id = '"+username+"' and check_out is null and date(check_in) = curdate()";
	        ResultSet rs = stmt.executeQuery(sql);
	        if (rs.next())
	        	res = true;
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return false; 
	    }
		
		return res;
	}
	
	
	
	public ArrayList<Employee> getDateTime(String name)
	{
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    ArrayList<Employee> res = new ArrayList<Employee>(5);
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();

	        String sql;
	        sql = "select emp_id,sum(timestampdiff(second,check_in,check_out)) as secs_active ,date(check_in) as date from attendance_detail where emp_id='"+name+"' group by emp_id,date(check_in) order by date(check_in) desc";
	        ResultSet rs = stmt.executeQuery(sql);
	        while (rs.next())
	        {
	        	Employee emp_new = new Employee();
	        	emp_new.setName(rs.getString("emp_id"));
	        	String val = rs.getString("secs_active");
	        	String time_active = null;
	        	if (val==null)
	        	{
	        		time_active = "0 hours and 0 minutes";
	        	}
	        	else
	        	{
	        	int sec = Integer.parseInt(val);
	        	int hrs = sec/3600;
	            int mins = ((sec-hrs*3600)/60);
	            String hrs_str = String.valueOf(hrs);
	            String mins_str = String.valueOf(mins);
	            time_active = hrs_str+" hours and "+mins_str+" minutes";
	        	
	        	}
	        	emp_new.setSecActive(time_active);
	        	emp_new.setDate(rs.getString("date"));
	        	
	        	res.add(emp_new);
	        }
	        
	        rs.close();
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	         return res; 
	    }
		
		return res;
		
		
	}
	
	
}
