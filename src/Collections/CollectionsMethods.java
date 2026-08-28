//ArrayList methods
package Collections;

import java.util.ArrayList;

public class CollectionsMethods {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("bahubali");
		al.add("devasena");
		al.add("katappa");
		al.add("shivagami");
		al.add("kalakeya");
		
		System.out.println(al);
		System.out.println(al.contains("devasena"));
		System.out.println(al.equals("devasena"));
		System.out.println(al.get(4));
		System.out.println(al.indexOf(2));
		System.out.println(al.isEmpty());
		System.out.println(al.set(3,"bujjideva"));
		
		
		ArrayList al1=new ArrayList();
		al1.add("kuntala");
		al1.add("bahubali");
		al1.add("mahishmathi");
		al1.add("ballala");
		al1.add("error");
		
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.size());
		
		al.retainAll(al1);
		System.out.println(al);
		
		al.removeAll(al1);
		System.out.println(al);
	}

}
