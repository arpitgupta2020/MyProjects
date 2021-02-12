package com.arpit.mostliked.leetcode;

import java.util.Arrays;

//https://www.youtube.com/watch?v=1R0_7HqNaW0

//http://youtube.com/watch?v=NJuKJ8sasGk

//https://leetcode.com/problems/coin-change/

class CoinChangeProblemSolution {
	
	public static int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		int[] dp =  new int[amount +1];
		Arrays.fill(dp, amount +1);
		dp[0] =0;
		for(int i=0; i<=amount; i++) {
			for(int j=0; j<coins.length; j++) {
				if(coins[j]<=i) {
					dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
				}else {
					break;
				}
			}
		}
		return dp[amount] > amount ? -1: dp[amount];
	}
}

public class CoinChangeProblem {

	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		System.out.println(CoinChangeProblemSolution.coinChange(coins, amount));

	}

}
