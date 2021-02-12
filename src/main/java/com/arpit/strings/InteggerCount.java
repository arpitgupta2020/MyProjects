package com.arpit.strings;

public class InteggerCount {

	public static void main(String[] args) {
		
		int[] count = new int[256];
		int[] number =new int[] {1,4,5,6,6,3,4,3};
		for(int x:number) {
			count[x]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]==1) {
				System.out.println(i);
			}
		}

	}

}