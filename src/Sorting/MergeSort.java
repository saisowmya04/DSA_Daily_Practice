package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int arr[],int nOfEle) {
		
		// base condition
		if(nOfEle<2) {
			return;
		}
		
		int mid=nOfEle/2;
		int leftArr[]=new int[mid];
		int rightArr[]=new int[nOfEle-mid];
		
		//fill all the elements before mid
		for(int i=0;i<mid;i++) {
			leftArr[i]=arr[i];
		}
		
		//insert into right array
		for(int i=mid;i<nOfEle;i++) {
			rightArr[i-mid]=arr[i];
		}
		
		//left array again dividing small subarray until single elements
		mergeSort(leftArr,mid);
		mergeSort(rightArr,nOfEle-mid);
		
		//merge the values
		merge(arr,leftArr,rightArr,mid,nOfEle-mid);
	}
	
	
	public static void merge(int arr[],int[] leftArr,int[] rightArr,int left,int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(leftArr[i]<rightArr[j]) {
				arr[k++]=leftArr[i++];
			}
			else {
				arr[k++]=rightArr[j++];
			}
		}
		
		//remaining elements
		while(i<left) {
			arr[k++]=leftArr[i++];
		}
		while(j<right) {
			arr[k++]=rightArr[j++];
		}
		
	}
	
	public static void main(String args[]) {
		int arr[]= {5,9,2,4,8,1,6,3};
		mergeSort(arr,8);
		System.out.println(Arrays.toString(arr));
	}

}
