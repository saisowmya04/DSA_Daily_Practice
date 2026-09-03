//inserting an element in an array at particular position
package Arrays;

public class ArrayPosition {

	public static void main(String[] args) {
		int arr1[]= {10,20,40,50};
		int arr2[]=new int[arr1.length+1];
		int pos=2;
		int val=30;
		
		
		  //inserting values upto position 
		for(int i=0;i<arr1.length;i++) {
		  arr2[i]=arr1[i]; 
		}
		  
		  //inserting at a specific position 
		arr2[pos]=val;
		  
		  //remaining values insert into new array 
		for(int i=pos;i<arr1.length;i++) {
		  arr2[i+1]=arr1[i]; 
		}
		  
		  //traversing each element 
		for(int j=0;j<arr2.length;j++) {
		  System.out.print(arr2[j]+" "); 
		}
		 
		
		
	}

}
