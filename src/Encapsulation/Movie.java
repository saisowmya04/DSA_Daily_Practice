//encapsulation
package Encapsulation;

public class Movie {
	private int id;
	private String name;
	private int seatno;
	
	//getters to access private variables
	public int getId() {
		return id;
		
	}
	
	//getters to access private variables
	public String getName() {
		return name;
	}
	
	//getters to access private variables
	public int getSeatNo() {
		return seatno;
	}
	
	//setters to update 
	public void setId(int id) {
		this.id=id;
	}
	
	//setters 
	public void setName(String name) {
		this.name=name;
	}
	
	//setters 
	public void setSeatNo(int seatno) {
		this.seatno=seatno;
	}

}
