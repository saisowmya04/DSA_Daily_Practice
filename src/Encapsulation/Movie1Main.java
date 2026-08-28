//random class - upgrade of encapsulation which is available in 16th version of java 
package Encapsulation;

public class Movie1Main {

	public static void main(String[] args) {
		Movie1 m1=new Movie1(100,"Chennai Express",80);
		System.out.println("Movie Ticket Id: "+m1.id());
		System.out.println("Movie Name: "+m1.name());
		System.out.println("Seat Number: "+m1.seatno());
	}

}
