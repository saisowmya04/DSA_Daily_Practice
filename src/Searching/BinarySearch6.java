//insert element using binary search
package Searching;

public class BinarySearch6 {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5};
		int target=2;
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.println("Position is: "+left);
	}

}
