//sumof array
package Arrays;

public class SumOfArray {
	public static void main(String args[]) {
		int arr[]= {1,3,5,7,11};
		int sum=0;
		
		//traverse each element in array
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		
	}

}
