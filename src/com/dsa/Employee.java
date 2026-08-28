package com.dsa;
import java.math.BigInteger;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int empid=0;
		String name="";
		String fullname="";
		double salary=0;
		String address="";
		int atm_pin=0;
		long anu_salary=0;
		int inc=0;
		double ht_emp=0.0;
		BigInteger phn_number=BigInteger.ZERO;
		BigInteger ad_number=BigInteger.ZERO;
		char marital_status=' ';
		
		//employee id
		System.out.println("Employee id: ");
		if(sc.hasNextInt()) {
			empid=sc.nextInt();
		}
		else {
			System.out.println("Employee id is not valid");
		}
		
		//emp name
		System.out.println("Enter Employee name: ");
		if(sc.hasNext()) {
			name=sc.next();
		}
		else {
			System.out.println("Employee name is not valid");
		}
		
		//emp full name
		System.out.println("Enter Employee fullname: ");
		if(sc.hasNextLine()) {
			fullname=sc.nextLine();
		}
		else {
			System.out.println("Employee fullname is invalid");
		}
		
		//emp salary
		System.out.println("Enter employee salary: ");
		if(sc.hasNextDouble()) {
			salary=sc.nextDouble();
		}
		else {
			System.out.println("Employee salary is invalid");
		}
		
		//emp address
		System.out.println("Enter employee address: ");
		if(sc.hasNextLine()) {
			address=sc.nextLine();
		}
		else {
			System.out.println("Address is invalid");
		}
		
		//emp atm pin
		System.out.println("Enter atm pin number: ");
		if(sc.hasNextInt()) {
			atm_pin=sc.nextInt();
		}
		else {
			System.out.println("Pin number is invalid");
		}
		
		//emp anu_sal
		System.out.println("Enter annual salary of employee: ");
		if(sc.hasNextLong()) {
			anu_salary=sc.nextLong();
		}
		else {
			System.out.println("Annual Salary is incorrect");
		}
		
		//inc
		System.out.println("Enter income: ");
		if(sc.hasNextInt()) {
			inc=sc.nextInt();
		}
		else {
			System.out.println("Invalid income");
		}
		
		//ht_emp
		System.out.println("Enter height of employee: ");
		if(sc.hasNextInt()) {
			ht_emp=sc.nextInt();
		}
		else {
			System.out.println("Height is invalid");
		}
		
		//phno
		System.out.println("Enter phone number of employee: ");
		if(sc.hasNextBigInteger()) {
			phn_number=sc.nextBigInteger();
		}
		else {
			System.out.println("Invalid");
		}
		
		//ad_number
		System.out.println("Enter aadhar number of an employee: ");
		if(sc.hasNextBigInteger()) {
			ad_number=sc.nextBigInteger();
		}
		else {
			System.out.println("Invalid aadhar number");
		}
		
		
	}

}
