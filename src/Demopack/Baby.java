package Demopack;


interface Mom{
	default void sleep() {
		System.out.println("sleep left direction");
	}
	
	default void display() {
		System.out.println("i am display");
	}
	default void minnu() {
		System.out.println("i am minnu");
	}
}

interface Dad{
	default void sleep() {
		System.out.println("sleep right direction");
	}
}


public class Baby implements Dad,Mom {

	public void sleep() {
		System.out.println("i can sleep on my own");
		Mom.super.sleep();
		//Dad.super.sleep();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mom b=new Baby();
		b.sleep();
		

	}

}
