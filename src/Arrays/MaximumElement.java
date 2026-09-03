package Arrays;

public class MaximumElement {

	public static void main(String[] args) {
		int arr[]= {2,6,14,1,0,9,10};
		int max=arr[0];
		
		//traverse each element
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
			
		System.out.println("Max: "+max);
	
	}

}
