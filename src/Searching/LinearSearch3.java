//linear searching using strings
package Searching;

public class LinearSearch3 {

	public static void main(String[] args) {
		String arr[]={"Sai","Sowmya","charan","kavitha","tirupati"};
		String target="tirupati";
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(target)) {
				index=i;
				break;
			}
		}
		System.out.println(index!=-1?"found at index: "+index:"not found");
	}

}
