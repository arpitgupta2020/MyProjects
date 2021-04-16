package com.arpit.myPrep;

//WAP to separate odd numbers from even.
// input - [-2, 0,7,4,5,66]   
// output - [-2,0, 4,66,7,5]

public class chepProgram1 {

	public int[] oddEven(int arr[]) {
	   
	  // int[] result= new int[6];
	   //Handled 4th condition
	   if(arr.length == 0){
	     System.out.print("Array is empty");
	     return arr;
	   }
	
	   for(int i=0; i<= arr.length-1; i++){
		  
	     if(arr[i] % 2 != 0){
	    	 
	    	 int currentOdd= arr[i];
	  	     
	  	     for(int j= i+1; j< arr.length-1; j++){
	  	    		 arr[j]= arr[j+1];
	  	      }
	  	     arr[arr.length-1]= currentOdd;
	     }
	     else {
	    	 arr[i]= arr[i];
	     }
	   }
	 
	     return arr;
	   }
	     
	public static void main(String[] args) {
		chepProgram1 cp= new chepProgram1();
		int input[]= {12, 34, 45, 9, 8, 90, 3};
		int result[]= cp.oddEven(input);
		
		for(int i=0; i< result.length; i++) {
			System.out.print(result[i]+", ");
		}
	}

}
