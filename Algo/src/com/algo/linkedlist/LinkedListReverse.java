package com.algo.linkedlist;

public class LinkedListReverse {
	
	Node head;

	public class Node{
		Node next;
		int data;
		public Node(int data,Node next){
			this.data = data;
			this.next = next;
		}
		public Node(int data){
			this.data = data;
		}
	}
	
	public void addNodeToEnd(Node node){
		if(head == null){
			head = node;
			return;
		}
		Node n = head;
		Node prev = null;
		while(n!=null){
			prev = n;
			n = n.next;
			
		}
		prev.next = node;
	}
	
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	public void reverseList(){
		Node n = head;
		if(n == null)return;
		Node prev = null;
		while(n.next != null){
			Node next = n.next;
			n.next = prev;
			prev = n;
			n = next;
		}
		n.next = prev;
		head = n;
	}
	
	public void reset(){
		head = null;
	}
	
	public static void main(String[] args) {
		LinkedListReverse llr = new LinkedListReverse();
		// Create list as 5->2->3->4->1 & print & reverse
		llr.addNodeToEnd(llr.new Node(5));
		llr.addNodeToEnd(llr.new Node(2));
		llr.addNodeToEnd(llr.new Node(3));
		llr.addNodeToEnd(llr.new Node(4));
		llr.addNodeToEnd(llr.new Node(1));
		llr.printList();
		llr.reverseList();
		llr.printList();
		// Reset list
		llr.reset();
		// Print and reverse empty list
		llr.printList();
		llr.reverseList();
		// Reset list again
		llr.reset();
		// Create a list with single node
		llr.addNodeToEnd(llr.new Node(5));
		// Print and reverse
		llr.printList();
		llr.reverseList();
		llr.printList();
	}
}
