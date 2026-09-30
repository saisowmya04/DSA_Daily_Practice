package Recursion;

public class Fibonacci {
	
	
	public static int fibRec(int n) {
		if(n<=1) {
			return n;
		}
		return fibRec(n-1)+fibRec(n-2);
	}

	public static void main(String[] args) {
		System.out.println(fibRec(5));
	}

}
