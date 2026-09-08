//linear search using sorted array
package Searching;

public class LinearSearch2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9,10};
		int target=8;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=true;
			}
			if(arr[i]>target) {
				break;
			}
		}
		System.out.println(found?"element found":"element not found");
	}

}
