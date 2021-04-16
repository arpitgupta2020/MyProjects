package com.arpit.myPrep;

public class PrintMatrixInSpiralForm {
	
	private static int spiralPrint(int m, int n, int[][] a, int lastElement) {
		
		int k=0, l=0, i, counter=0;
		int lastelement= -1;
		
		/*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
		
		while(k<m && l<n && counter<lastElement) {
			// Print the first row from the remaining rows
			for(i=l; i<n; ++i) {
				System.out.print(a[k][i]+" ");
				counter++;
				if(counter == lastElement) {
					lastElement= a[k][i];
				}
			}
			k++;
			// Print the last column from the remaining columns
			for(i=k; i<m; ++i) {
				System.out.print(a[i][n-1]+" ");
				counter++;
				if(counter == lastElement) {
					lastElement= a[i][n-1];
				}
			}
			n--;
			if(k<m) {
				// Print the last row from the remaining rows
				for(i=n-1; i>=l; --i) {
					System.out.print(a[m-1][i]+" ");
					counter++;
					if(counter == lastElement) {
						lastElement= a[m-1][i];
					}
				}
				m--;
			}
			if(l<n) {
				// Print the first column from the remaining columns
				for(i=m-1; i>=k; --i){ 
					System.out.print(a[i][l]+" ");
					counter++;
					if(counter == lastElement) {
						lastElement= a[i][l];
					}
				}
				l++;
			}
			
			
		}
		return lastElement;
		
	}


	public static void main(String[] args) {
		int R=3;
		int C=6;
		int a[][]= {{1,2,3,4,5,6},
				{7,8,9,10,11,12},
				{13,14,15,16,17,18}};
		
		int lastElement= 17;
				
			
		System.out.println("Last Element: "+ spiralPrint(R, C, a, lastElement));
	}
}
