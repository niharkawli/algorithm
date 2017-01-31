package com.algo.bst;

public class BinarySearchTree {

	static Node root;
	
	
	public static boolean addData(int data){
		Node node = new Node(data);
		Node head = root;
		Node prev = null;
		while(head != null){
			prev = head;
			if(data < head.item){
				head = head.left;
			}else{
				head = head.right;
			}
		}
		if(prev == null){
			root = node;
			return true;
		}else {
			if(data < prev.item){
				prev.left = node;
			}else{
				prev.right = node;
			}
		}
		return true;
	}
	
	public static void printTree(Node root){
		if(root == null) return;
		printTree(root.left);
		System.out.println(root.item);
		printTree(root.right);
	}
	
	public static boolean isValidTree(Node root){
		if(root == null) return true;
		if(root.left != null && root.item < root.left.item)return false;
		if(root.right != null && root.item > root.right.item)return false;
		return isValidTree(root.left) && isValidTree(root.right);
	}
	
	public static void main(String[] args) {
		addData(5);
		addData(4);
		addData(3);
		addData(2);
		addData(1);
		
		printTree(root);
		Node root1 = new Node(4);
		Node left1 = new Node(3);
		root1.left=left1;
		Node right1 = new Node(5);
		root1.right = right1;
		Node left2 = new Node(4);
		left1.left = left2;
		System.out.println(isValidTree(root1));
	}
	
}
