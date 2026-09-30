package Recursion;

public class ReverseString {
	
	public static String revString(String s) {
		if(s.length()<=1) {
			return s;
		}
		return revString(s.substring(1))+s.charAt(0);
		
	}

	public static void main(String[] args) {
		System.out.println(revString("hello"));
	}

}
