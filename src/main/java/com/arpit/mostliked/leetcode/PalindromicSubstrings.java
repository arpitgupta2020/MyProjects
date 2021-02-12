 package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=QX8RBlXvKXg

//https://leetcode.com/problems/palindromic-substrings/

class PalindromicSubStringsSolution {

	public static int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j >= 0; j--){

                
                if(s.charAt(j) == s.charAt(i) && (i-j <= 2  || dp[i+1][j-1]) ){
                    dp[i][j] = true;
                }
                
                if(dp[i][j]) res++;
            }
        }
        
        
        return res;
    }
}

public class PalindromicSubstrings {

	public static void main(String[] args) {
		String s = "aaa";
		System.out.println(PalindromicSubStringsSolution.countSubstrings(s));

	}

}
