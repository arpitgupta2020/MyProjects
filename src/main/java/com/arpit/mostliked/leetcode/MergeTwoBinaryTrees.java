package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=_LJO5nBKC1A

class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		this.val = x;
	}

	public TreeNode MergeTwoBinaryTreesSolution(TreeNode t1, TreeNode t2) {

		if (t1 == null) {
			return t2;
		}

		if (t2 == null) {
			return t1;
		}

		t1.val = t1.val + t2.val;
		t1.left = MergeTwoBinaryTreesSolution(t1.left, t2.left);
		t2.right = MergeTwoBinaryTreesSolution(t1.right, t2.right);
		return t1;

	}

}

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
