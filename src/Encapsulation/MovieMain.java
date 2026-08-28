package Encapsulation;

public class MovieMain {

	public static void main(String[] args) {
		Movie m=new Movie();
		m.setId(40);
		m.setName("jananayagan");
		m.setSeatNo(10);
		
		System.out.println("Movie Ticket Id: "+m.getId());
		System.out.println("Movie Name: "+m.getName());
		System.out.println("Seat Number: "+m.getSeatNo());
		
	}

}
