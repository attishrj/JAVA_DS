package com.learn.data.structure;

import com.learn.data.structure.LLNew.NodeInfo;

public class DoublylinkedList {
	DNode head;
	
	
	static class DNode{
		int data;
		DNode next;
		DNode prev;
		public DNode(int data) {
			this.data = data;
			DNode next=null;
			DNode prev=null;
		}
		
		
	}
	void display(DNode obj) {
		// obj=this.head;
		while (null != obj) {
			System.out.println("LLNew.display()" + obj.data);
			obj = obj.next;

		}
	}


	public static void main(String[] args) {
		DoublylinkedList dLL=new DoublylinkedList();
		dLL.head=new DNode(1);
		DNode second=new DNode(2);
		DNode third=new DNode(3);
	dLL.head.next=second;
	second.prev=dLL.head.next;
	second.next=third;
	third.prev=second.next;
	dLL.display(dLL.head);
		
		
		

	}

}
