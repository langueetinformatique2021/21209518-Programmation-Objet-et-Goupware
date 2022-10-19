package atelier04;

import java.util.Arrays;

public class condition4 {
	public static void main(String[]args) {
		int [] nums = {10,9,-1,4,8};
		 for (int i = 0; i< nums.length-1; i++) {
			 int minIndex = i;
			 
			 for (int j = i+1; j< nums.length; j++) {
				 if(nums[minIndex]>nums[j]) {
					 minIndex = j;
				 }
			 }
			 int temp = nums[minIndex];
			 nums[minIndex]=nums[i];
			 nums[i]=temp;
		 
		 }
		 System.out.println(nums[2]);
		
	}

}
