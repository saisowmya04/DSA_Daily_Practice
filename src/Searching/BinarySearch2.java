//binary search using strings
package Searching;

public class BinarySearch2 {

	public static void main(String[] args) {
		String names[]={"bahu","cartoon","deathrace","wrongturn"};
		String target="cartoon";
		int left=0;
		int right=names.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			int cmp=names[mid].compareTo(target);
			if(cmp==0) {
				System.out.println("Found at: "+mid);
				return;
			}
			else if(cmp>0) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
		}
		System.out.println("not found...");
		
	}

}
