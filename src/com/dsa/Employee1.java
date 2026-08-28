package com.dsa;

public class Employee1 {
	
	int empid;
	String empname;
	public Employee1(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	
	public Employee1() {
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname+"]";
	}

}
