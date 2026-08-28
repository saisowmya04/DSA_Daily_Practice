package com.dsa;

public class Employee1Main {

	public static void main(String[] args) {
		Employee1 e=new Employee1(123,"Keerthi");
		Employee1 e1=new Employee1(833,"suresh");
		Employee1 e2=new Employee1(256,"bahu");
		Employee1 e3=new Employee1(936,"bali");
		Employee1 e4=new Employee1(613,"sena");
		
		Employee1 emps[]= {e,e1,e2,e3,e4};
		
		
		//enhanced for loop
		for(Employee1 ee:emps) {
			System.out.println(ee);
		}


		
	}

}
