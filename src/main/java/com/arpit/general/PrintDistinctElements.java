package com.arpit.general;

public class PrintDistinctElements {

	public static void main(String[] args) {
		String s1 = "abaabcaabd";
		char[] c1 = s1.toCharArray();
		
		for(int i=0;i<c1.length;i++) {
			boolean isDistinct = false;
			for(int j=0;j<i;j++) {
				if(c1[i]==c1[j]) {
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct) {
				System.out.println(c1[i]);
			}
		}

	}

}
