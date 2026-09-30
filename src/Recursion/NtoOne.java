package Recursion;

public class NtoOne {
	
	//recursion
	public static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
	}

	public static void main(String[] args) {
		
		//basic program
		print(6);
		System.out.println("----------------");
		int n=5;
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
		print(6);
		
	}

}
