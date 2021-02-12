package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/container-with-most-water/

//https://www.youtube.com/watch?v=6PrIRPpTI9Q

class ContainerWithMostWaterSolution {

	public static int testContainerWithMostWaterSolution(int[] height) {

		int a_pointer = 0;
		int b_pointer = height.length - 1;
		int maxArea = 0;// as we haven't found anything
		if (height == null || height.length == 0) {
			return 0;
		}

		while (a_pointer < b_pointer) {
			if (height[a_pointer] < height[b_pointer]) {
				maxArea = Math.max(maxArea, height[a_pointer] * (b_pointer - a_pointer));
				a_pointer++;
			} else {
				maxArea = Math.max(maxArea, height[b_pointer] * (b_pointer - a_pointer));
				b_pointer--;
			}
		}

		return maxArea;
	}
}

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(ContainerWithMostWaterSolution.testContainerWithMostWaterSolution(height));

	}

}
