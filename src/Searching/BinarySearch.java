//binary search using sorted array`
package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80};
		int target=20;
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			int mid=(l+r)/2;
			if(arr[mid]==target) {
				System.out.println("found at: "+mid);
				return;
			}
			else if(arr[mid]<target) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		System.out.println("no element found");
	}

}
