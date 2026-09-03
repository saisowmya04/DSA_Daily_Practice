package Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		int sum=0;
		double avg;
		
		//traverse of each element
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=(sum)/(arr.length);
		System.out.println(avg);
	}

}
