//combination of left first occurence and right first occurence
package Searching;

public class BinarySearch5 {

	public static void main(String[] args) {
		int arr[]= {2,1,2,2,2,2,2,2,2,2,2,2,3,4};
		int target=2;
		int left=0;
		int right=arr.length-1;
		int first=-1;
		int last=-1;
		
		//for left first occurence
		while(left<=right) {
			int mid=(left+right)/2;
			
			//for left first occurence
			if(arr[mid]==target) {
				first=mid;
				right=mid-1; //this part is going left for first occurence
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
		}
		
		//for right first ocurence
		left=0;
		right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				last=mid;
				left=mid+1;
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		System.out.println("First occurence from left: "+first);
		System.out.println("First occurence from right: "+last);
		
	}

}
