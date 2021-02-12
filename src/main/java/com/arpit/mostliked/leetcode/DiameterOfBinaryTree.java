package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/diameter-of-binary-tree/submissions/


class DiameterOfBinaryTreeSolution {
    
    public static int height (TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
       if(root == null){
           return 0;
       }
    
       int option1 = height(root.left) + height(root.right);
       int option2 = diameterOfBinaryTree(root.left);
       int option3 = diameterOfBinaryTree(root.right); 
        
       // Maximum of option1, option2, option3
       return Math.max(option1, Math.max(option2, option3));
        
    }
}

public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
