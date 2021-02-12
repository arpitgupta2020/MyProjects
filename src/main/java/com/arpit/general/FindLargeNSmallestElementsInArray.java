package com.arpit.general;

public class FindLargeNSmallestElementsInArray {

	public static void main(String[] args) {
		int [] nums = new int[] {5,25,61,27,3,6,10};
		int smallest = nums[0];
		int largest = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>largest) {
				largest = nums[i];
			}else if (nums[i]< smallest){
				smallest = nums[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
