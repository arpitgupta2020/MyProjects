package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=UkWIRxkp8RQ

//https://leetcode.com/problems/word-search/

class WordSearchSolution {
	
	public boolean exist(char[][] board, String word) {
		
		if(board == null || board.length==0 || board[0].length ==0) {
			return false;
		}
		int m = board.length, n = board[0].length;
		
		for(int i =0; i<m; ++i) {
			for(int j =0; j<n; ++j) {
				if(searchWord(board, word, 0, i, j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean searchWord(char[][] board, String word, int index, int i, int j) {
		int m = board.length, n = board[0].length;
		
		if(index == word.length()) {
			return true;
		}
		
		if(i<0 || i>=m || j<0|| j>=n|| word.charAt(index)!= board[i][j]) {
			return false;
		}
		
		char c = board[i][j];
		board[i][j] = '#';
		boolean res = searchWord(board, word, index + 1, i -1, j)||
				searchWord(board, word, index + 1, i+1, j)||
				searchWord(board, word, index + 1, i, j-1)||
				searchWord(board, word, index + 1, i, j+1);
		
		board[i][j]= c;
		
		return res;
	}
}

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
