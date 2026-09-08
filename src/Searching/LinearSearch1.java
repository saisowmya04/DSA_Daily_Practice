//linear search - unsorted array
package Searching;

public class LinearSearch1 {

	public static void main(String[] args) {
		int arr[]= {23,89,18,37,49};
		int target=18;
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println("index: "+index);
	}

}
