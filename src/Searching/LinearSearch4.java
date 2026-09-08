//first even number using linear search
package Searching;

public class LinearSearch4 {

	public static void main(String[] args) {
		int arr[]= {5,7,2,11,10,1};
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				index=i;
				break;
			}
		}
		System.out.println(index!=-1?"first even element found":"not found");
	}

}
