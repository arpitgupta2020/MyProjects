package com.arpit.myPrep;

public class BinarySearchOfElements {

	private static int binarySearch(int[] array, int l, int r, int key) {
		if(r >= l) {
			int mid= (l+(r-1))/2;
			if(array[mid]==key) {
				return mid;
			}
			else if(array[mid]> key) 
				return binarySearch(array, l, mid-1, key);
			else
				return binarySearch(array, mid+1, r, key);
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int array[]= {2,4,6,8,10,12,14,15,17,45 };
		int key= 15;
		int len= array.length;
		int result= binarySearch(array, 0, len-1, key);
		
		if(result== -1) {
			System.out.println("Searched element is not found in Array");
		}else {
			System.out.println("Searched element is found in Array at: "+result);
		}
		
	}
}
