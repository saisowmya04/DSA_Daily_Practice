//finding out first occurence of element index from right in given array

package Searching;

public class BinarySearch4 {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,2,2,2,2,2,3,4};
		int left=0;
		int right=arr.length-1;
		int target=2;
		int ans=-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				ans=mid;
				left=mid+1;
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		System.out.println("First occurence from right: "+ans);
	}

}
