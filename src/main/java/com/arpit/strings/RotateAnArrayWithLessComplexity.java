package com.arpit.strings;

//https://www.geeksforgeeks.org/java-program-for-reversal-algorithm-for-array-rotation/
//https://www.youtube.com/watch?v=EpP6YuqzHe8
//https://www.geeksforgeeks.org/reversal-algorithm-right-rotation-array/

/* Right rotation:
 *  
 * AB whole reverse
 * B reverse
 * A reverse
 * 
 * Given Input: {1, 2, 3, 4, 5, 6, 7}
 * A = n-r;  (1, 2, 3, 4, 5)
 * B = r;    (6,7)
 * 
 * n= 7;
 * r =2;
 * 
 * AB whole reverse =  7,6,5,4,3,2,1
 * 
 * B reverse 6,7
 * A reverse 1,2,3,4,5
 * 
 * 
 */


/*Left Rotate:
 * A reverse
 * B reverse
 * AB whole reverse
 * 
 * A =r;
 * B = n-r;
 * 
 * {1, 2, 3, 4, 5, 6, 7}
 * 
 * n=7;
 * r =2;
 * 
 * A reverse 2,1
 * B reverse 7,6,5,4,3
 * AB whole reverse 3,4,5,6,7,1,2
 * 
 */

class RotateAnArrayWithLeastComplexity {

	public static void swapArrayWithoutStorage(int[] arr, int start, int end) {

		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rightRotateArray(int[] arr, int r, int n) {
	
		swapArrayWithoutStorage(arr, 0, n - 1);
		swapArrayWithoutStorage(arr, 0, r - 1);
		swapArrayWithoutStorage(arr, r, n - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void leftRotateArray(int[] arr, int r, int n) {
		
		swapArrayWithoutStorage(arr, 0, r - 1);
		swapArrayWithoutStorage(arr, r, n - 1);
		swapArrayWithoutStorage(arr, 0, n - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}

public class RotateAnArrayWithLessComplexity {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;
		int r =2;
		//RotateAnArrayWithLeastComplexity.rightRotateArray(arr, r, n);
		System.out.println("--------------------------------------");
		RotateAnArrayWithLeastComplexity.leftRotateArray(arr, r, n);

	}

}
