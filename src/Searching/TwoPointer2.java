//checking the given string is palindrome or not
package Searching;

public class TwoPointer2 {

	public static void main(String[] args) {	
		String s="levels";
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) {
				System.out.println("Not palindrome");
				return;
			}
			else {
				left++;
				right--;
			}
		}
		System.out.println("Palindrome");
		
	}

}
                      