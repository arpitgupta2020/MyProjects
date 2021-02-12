package com.arpit.arrays;

//https://www.youtube.com/watch?v=c9imv2LvgWk

class EquilibriumPoint {

	public static int sumOfArray(int[] array) {

		int[] sum = new int[array.length];
		sum[0] = array[0];
		int leftSum = 0;
		int rightSum = 1;
		int total;
		if (array.length > 2) {

			for (int i = 1; i <= array.length - 1; i++) {

				sum[i] = sum[i - 1] + array[i];

			}

			total = sum[array.length - 1];

			for (int k = 1; k < array.length - 1; k++) {

				leftSum = sum[k] - array[k];
				rightSum = total - sum[k];

				if (leftSum == rightSum)
					return k;

			}
		} else if (array.length == 1)
			return 1;
		return 0;
	}

}

public class EquilibriumPointInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 4, 0, -1 };
		System.out.println(EquilibriumPoint.sumOfArray(array));

	}

}
