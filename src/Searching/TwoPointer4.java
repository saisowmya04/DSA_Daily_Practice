//slow fast pointer - move zeros at last
package Searching;

import java.util.Arrays;

public class TwoPointer4 {

	
		public static void moveZeros(int arr[]) {
			int slow=0;
			for(int fast=0;fast<arr.length;fast++) {
				if(arr[fast]!=0) {
					int temp=arr[slow];
					arr[slow]=arr[fast];
					arr[fast]=temp;
					slow++; //forward to zero positioned element
				}
			}
		}
		public static void main(String[] args) {
			int arr[]= {0,1,0,2,12};
			moveZeros(arr);
			System.out.println(Arrays.toString(arr));
		}
	

}
