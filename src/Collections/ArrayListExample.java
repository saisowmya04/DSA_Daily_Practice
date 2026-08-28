//Collections
package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		//LinkedList al=new LinkedList();
		//Vector al=new Vector();
		Stack al=new Stack();
		
		System.out.println("initial capacity:"+al.capacity());
		System.out.println("initial size:"+al.size());
		
		al.add("bahubali");
		al.add("devasena");
		al.add(null);
		al.add(true);
		al.add(56.94);
		al.add(new Integer(549));
		al.add('g');
		al.add("ramesh");
		al.add("suresh");
		
		System.out.println(al);
		System.out.println("initial capacity:"+al.capacity());
		System.out.println("initial size:"+al.size());
		
	}

}
