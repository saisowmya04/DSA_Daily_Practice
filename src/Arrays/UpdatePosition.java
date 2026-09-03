//update value at particular index
package Arrays;

public class UpdatePosition {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int pos=1;
		
		for(int i=0;i<arr1.length;i++) {
			if(i==pos) {
				arr1[i]=20;
			}
			System.out.print(arr1[i]+" ");
		}
		
	}

}
