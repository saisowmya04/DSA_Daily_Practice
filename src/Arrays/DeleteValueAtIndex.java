//delete element at particular position
package Arrays;

public class DeleteValueAtIndex {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int pos=2;
		
		//create an array
		int arr2[]=new int[arr1.length-1];
		
		//inserting values before postion
		for(int i=0;i<pos;i++) {
			arr2[i]=arr1[i];
		}
		//traversing each element
		for(int i=pos;i<arr2.length;i++) {
			arr2[i]=arr1[i+1];
		}
		System.out.println("After deleting specific positions");
		for(int x:arr2) {
			System.out.print(x+" ");
		}
		
	}

}
