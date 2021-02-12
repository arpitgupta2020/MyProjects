package com.arpit.strings;

class UrlifySolution {
	
	public static String replace(String s,int length) {

        char arr[] = s.toCharArray();
        StringBuffer sb = new StringBuffer(length);

        for (int i = 0; i < length; i++) {
            if (arr[i] ==' ')
                sb.append("%20");
            else
                sb.append(arr[i]);

        }

        return sb.toString();
    }
}

public class Urlify {

	public static void main(String[] args) {
		
		String s = "Mr John Smith  ";
		System.out.println(UrlifySolution.replace(s,13));
		
	}

}