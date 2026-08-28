package com.dsa;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,5,7,9,4);
		System.out.println(nums);
		
		int arr[]= {5,9,2,7,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int index=Arrays.binarySearch(arr, 2);
		System.out.println("index: "+index);
		
		int arr1[]= {1,2,3};
		int []arr2= {1,2,3};
		
		Arrays.equals(arr1, arr2);
		Arrays.compare(arr1,arr2);
		
		int st[]= {6,9,3,2};
		int cpy[]=Arrays.copyOf(st, 10);
		System.out.println(Arrays.toString(cpy));
		
		int[] cpy1=Arrays.copyOfRange(st, 2, 4);
		System.out.println(Arrays.toString(cpy1));
		
		int dt[]=new int[6];
		Arrays.fill(dt, 7);
		System.out.println(Arrays.toString(dt));
		
		
	}

}
