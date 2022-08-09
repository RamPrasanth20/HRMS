package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Model.EmployeeLoginData;

public class EmployeeLoginDao {
	public boolean validate(EmployeeLoginData emp_data)
	{
		boolean retval = false;
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost:3306/demodb";
	    final String USER = "root";
	    final String PASS = "Suryavelu@1";
	    
	    try {
	    	Class.forName(JDBC_DRIVER);
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	Statement stmt = conn.createStatement();
	    	String sql;
	        sql = "SELECT passwrd FROM emp_detail where emp_id = '"+emp_data.getUserName()+"'";
	        ResultSet rs = stmt.executeQuery(sql);
	        if (rs.next()) {
	        System.out.println("the pwd is "+rs.getString("passwrd"));
	        String u_password = emp_data.getPassword();
	        if (u_password.equals(rs.getString("passwrd"))) {
	        	retval = true;
	        }
	        else {
	        	retval = false;
	        }
	        }
	        else {
	        	retval =  false;
	        }
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
	    return retval;
	}
}
