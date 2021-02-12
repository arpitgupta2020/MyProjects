package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=Hg82DzMemMI

class HasPathsSolution {

	public boolean hasPaths(TreeNode root, int sum) {

		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null && sum - root.val == 0) {
			return true;
		} else {
			return hasPaths(root.left, sum - root.val) || hasPaths(root.right, sum - root.val);
		}
	}
}

public class HasPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
