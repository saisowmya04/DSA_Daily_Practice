//to find target using array list
package Searching;

import java.util.Arrays;
import java.util.List;

public class LinearSearch5 {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("pen","pencil","paper","book");
		String target="book";
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals(target)) {
				System.out.println("element found: "+i);
			}
		}
		
	}

}
