//two sum using hash map
package Searching;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=13;
		
		//create map to store k values
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int compliment=target-nums[i];
			if(map.containsKey(compliment)) {
				System.out.println("indexes: "+map.get(compliment)+" "+i);
				return;
			}
			map.put(nums[i],i);
		}
		System.out.println("no pair found");
	}

}
