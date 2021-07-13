package com.bridgelabz.program;

public class AppendingLinkedList {
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
	public void insert (int data) {
			
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
	}
	// method to print the linkedlist
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
	// method to append the data in the linkedlist
	public void append(int data) {
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
	 }
	// method to print the appended data linkedlist
	public void printf() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}

}
