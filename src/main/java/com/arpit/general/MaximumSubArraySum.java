package com.arpit.general;

public class MaximumSubArraySum {

	public int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
		return max;
	}

	public static void main(String[] args) {

		MaximumSubArraySum maxSubArraySum = new MaximumSubArraySum();
		int[] a1 = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(maxSubArraySum.maxSubArray(a1));

	}
}