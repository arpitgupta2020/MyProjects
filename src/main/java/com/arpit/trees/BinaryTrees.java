package com.arpit.trees;

//https://www.youtube.com/watch?v=M6lYob8STMI


class Node {

	int key;
	String name;
	Node leftChild;
	Node rightChild;

	Node(int key, String name) {
		this.key = key;
		this.name = name;

	}

	public String toString() {
		return name + "has key" + key;
	}
}

public class BinaryTrees {

	Node root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node focusedNode = root;
			Node parent;

			while (true) {
				parent = focusedNode;

				if (key < focusedNode.key) {
					focusedNode = focusedNode.leftChild;

					if (focusedNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusedNode = focusedNode.rightChild;

					if (focusedNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderTraversal(Node focusedNode) {

		if (focusedNode != null) {
			inOrderTraversal(focusedNode.leftChild);
			System.out.println(focusedNode);
			inOrderTraversal(focusedNode.rightChild);
		}
	}

	public void preOrderTraversal(Node focusedNode) {

		if (focusedNode != null) {
			System.out.println(focusedNode);
			preOrderTraversal(focusedNode.leftChild);
			preOrderTraversal(focusedNode.rightChild);
		}
	}
	
	public void postOrderTraversal(Node focusedNode) {

		if (focusedNode != null) {
			postOrderTraversal(focusedNode.leftChild);
			postOrderTraversal(focusedNode.rightChild);
			System.out.println(focusedNode);
		}
	}

	public static void main(String[] args) {
		BinaryTrees binaryTree = new BinaryTrees();
		binaryTree.addNode(50, "Boss");
		binaryTree.addNode(25, "Vice Pre");
		binaryTree.addNode(15, "Office Manager");
		binaryTree.addNode(30, "Secretary");
		binaryTree.addNode(75, "Sales Manager");
		binaryTree.addNode(85, "SalesMan 1");
		
		binaryTree.preOrderTraversal(binaryTree.root);

	}

}
