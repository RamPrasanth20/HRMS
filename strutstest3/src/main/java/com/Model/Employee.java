package com.Model;

public class Employee {
	private String Name;
	private String Date,SecActive;

	

	public String getSecActive() {
		return SecActive;
	}

	public void setSecActive(String secActive) {
		this.SecActive = secActive;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public Employee(String name)
	{
		this.Name = name;
	}
	
	public Employee()
	{
	}
	
}
