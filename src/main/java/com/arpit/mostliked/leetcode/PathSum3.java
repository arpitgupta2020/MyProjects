package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/path-sum-iii/

class PathSum3Solution {

	public int countPaths(TreeNode root, int sum) {

		int count = 0;
		if (root == null) {
			return count;
		}

		if (root.val == sum) {
			count++;
		}

		count = count + countPaths(root.left, sum - root.val);
		count = count + countPaths(root.right, sum - root.val);
		return count;

	}

	public int pathSum(TreeNode root, int sum) {

		if (root == null) {
			return 0;
		}

		return countPaths(root, sum) + countPaths(root.left, sum) + countPaths(root.right, sum);
	}

}

public class PathSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
