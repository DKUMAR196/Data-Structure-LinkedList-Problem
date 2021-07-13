package com.bridgelabz.program;

public class FindSizeLinkedList {
	public static int count = 0;
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
			count++;
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
	// method to insert between linkedlist
	public void insertAfter(Node prevNode, int value){

		if (prevNode == null){
			System.out.println("Previous Node Should Not Be NULL");
			return;
		}
		
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	// method to search the element in the linkedlist
	public void searchNode(int data) {  
        Node current = head;  
        int index = 1;  
        boolean flag = false;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                index ++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is at Index : " + index);  
        else  
             System.out.println("Element is not in the LinkedList");  
    }  
	// method to delete an element
	public void deleteElement(int check){
        Node current = head;    
	    while (current != null) { 
	         if (current.next.data == check) {
	              current.next=null;
	         }
			count --;
	         current = current.next; 
	    }
	  
	}
	public static void printsize() {
		System.out.println("size of list: " +(count+1) );
	}	
}
