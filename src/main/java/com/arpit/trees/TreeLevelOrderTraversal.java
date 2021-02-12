package com.arpit.trees;

//https://github.com/mission-peace/interview/blob/master/src/com/interview/tree/TreeTraversalLevelByLevel.java#L78
//https://www.youtube.com/watch?v=7uG0gLDbhsI

/*
    public void levelByLevelOneQueueUsingDelimiter(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            root = q.poll();
            if (root != null) {
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            } else {
                if (!q.isEmpty()) {
                    System.out.println();
                    q.offer(null);
                }
            }
        }
    }
*/

public class TreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
