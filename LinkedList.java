package com.learn.data.structure;

public class LinkedList {
	
	Node head;
	
	 static class Node { 
	        int data; 
	        Node next; 
	        Node(int d)  { data = d;  next=null; } // Constructor 
	    }
	public static void main(String[] args) {
		LinkedList lList=new LinkedList();
		  Node second      = new Node(2); 
	        Node third       = new Node(3);
	       Node forth=new Node(12);
		lList.head=new Node(5);
		lList.head.next=second;
		second.next=third;
		third.next=forth;
		lList.display();
		System.out.println("After insert at begin");
		lList.insertAtBegin(55);
		lList.display();
		System.out.println("After insert at end");
		lList.insertAtEnd(45);
		lList.display();
		
		
	}
	
	void insertAtBegin(int dataP){
//		System.out.println("LinkedList.head.data"+head.data);
//		System.out.println("LinkedList.head.next"+head.next);
//		System.out.println("LinkedList.head"+head);
		Node n=head;
		
//		System.out.println("LinkedList.n.data"+n.data);
//		System.out.println("LinkedList.n.next"+n.next);
//		System.out.println("LinkedList.n"+n);
//		System.out.println(n.next==head.next);
//		System.out.println(n==head);
		n.data=dataP;
		n.next=head.next;
//		System.out.println("LinkedList.head"+head);
//		Node tempNode=n;
//		n=head;
//		head=tempNode;
//		
//		System.out.println("LinkedList.n"+n);
		
	}
	
	void insertAtEnd(int dataAtEnd)
	{
		Node last=head;
		while (last.next!=null) {
			last=last.next;
		}
		last.next=new Node(dataAtEnd);
		
		 // head.data=dataAtEnd;
	//	nodeAtEnd.data=dataAtEnd;
		///nodeAtEnd.next=null;
		
	}
	void display()
	{
		Node obj=head;
		while (obj!=null) {
			System.out.println("data in the list are "+obj.data);
			obj=obj.next;
		}
	}
	
	

}
