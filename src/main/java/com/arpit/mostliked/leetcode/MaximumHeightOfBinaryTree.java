package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=hmWhJyz5kqc

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaximumHeightOfBinaryTreeSolution {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return 1;
        }
        
        int lDepth = root.left !=null ? maxDepth(root.left) : Integer.MIN_VALUE;
        int rDepth = root.right !=null ? maxDepth(root.right) : Integer.MIN_VALUE;
        
        return 1 + Math.max(lDepth, rDepth);
        
    }
}

public class MaximumHeightOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
