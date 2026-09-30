package Recursion;

public class SumOfDigits {
	
	public static int sumDigits(int n) {
		//base condition
		if(n==0)
		{
			return 0;
		}
		return n%10+sumDigits(n/10);
		
	}

	public static void main(String[] args) {
		System.out.println(sumDigits(1234));
	}

}
