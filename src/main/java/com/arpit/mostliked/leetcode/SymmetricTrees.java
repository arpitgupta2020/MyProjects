package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=-5E5Jt_HKLc

//https://leetcode.com/problems/symmetric-tree/

class MirrorTreesSolution {

	public boolean isSymmetric(TreeNode root) {

		return isMirror(root, root);

	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {

		if (t1 == null && t2 == null) {
			return true;
		}

		if (t1 == null || t2 == null) {
			return false;
		}

		return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t2.left, t1.right);
	}

}

public class SymmetricTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
