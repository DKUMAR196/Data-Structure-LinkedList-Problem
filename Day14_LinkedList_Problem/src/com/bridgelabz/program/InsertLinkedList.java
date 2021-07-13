package com.bridgelabz.program;

public class InsertLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	 // method to insert the data into linkedlist 
	public Node insert (int data) {
			
		Node newNode = new Node(data);
		if (head == null){
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}
	// method to print the linkedlist
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	public void insertAfter(Node prevNode, int value){

		if (prevNode == null)
		{
		System.out.println("Previous Node Should Not Be NULL");
		return;
		}
		
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
}
