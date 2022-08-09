package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Model.SignupData;

public class SignupDao {
	
	
	public boolean Validate(SignupData sign_data)
	{
		
		String uname = sign_data.getUserName();
		String passwd = sign_data.getPassword();
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
	        sql = "SELECT passwrd FROM usercred where username = '"+uname+"'";
	        ResultSet rs = stmt.executeQuery(sql);
	        if (rs.next())
	        {
	        	retval = false;
	        }
	        else {
	        stmt = conn.createStatement();
	        sql = "INSERT INTO usercred values ("+"'"+uname+"' , '"+passwd+"')";
	        stmt.executeUpdate(sql);
	        
	        System.out.println("sign up successfull");
	        retval = true;
	        }
	        rs.close();
	        stmt.close();
	        conn.close();
	    }
	    catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	         System.out.println("enrror occured");
	    }
		return retval;
	}
}
