//non repeating character using hash map
package Searching;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str="SaiSowmya";
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			int defaultValue;
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==1) {
				System.out.println("index: "+i);
				return;
			}
		}
		System.out.println("no element");
		
	}

}
