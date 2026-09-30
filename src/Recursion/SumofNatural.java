package Recursion;

public class SumofNatural {
	
	public static int sum1(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	
	public static int sumRec(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumRec(n-1);
	}
	
	public static void main(String args[]) {
		System.out.println("Loop: "+sum1(5));
		System.out.println("Recursion: "+sumRec(5));
	}

}
