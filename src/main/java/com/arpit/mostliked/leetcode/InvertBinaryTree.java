package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=FtdyIHBaKjc

class InvertBinaryTreeSolution {

	public TreeNode invertTree(TreeNode root) {

		if (root == null) {
			return root;
		} else {
			TreeNode temp;
			invertTree(root.left);
			invertTree(root.right);

			temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		return root;
	}
}

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
