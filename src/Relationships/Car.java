//is-a and has-a relationships
//car is a vehicle and every car has a engine
package Relationships;

class Vehicle{
	public void m1() {
		System.out.println("Start Vehicle..");
	}
}

class Engine{
	public void m2() {
		System.out.println("Engine on");
	}
}
public class Car extends Vehicle {
	Engine e=new Engine(); //has-a relationship

	public void m3() {
		e.m2();
		System.out.println("Car Started");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.m1();
		c.m3();
		
	}
	
	
	
		
}
