//generics are used to store which type of values u want to staore in array list
package Collections;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("bahubli");
		al.add("devasena");
		al.add("katappa");
		al.add("shivagami");
		//al.add(456);// error - because we are storing string values not integer
		//al.add(89);// error - because we are storing string values not integer
		
		
		System.out.println(al);
	}

}
