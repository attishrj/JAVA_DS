package com.learn.data.structure;

public class LLNew {
	NodeInfo head;

	static public class NodeInfo {
		int data;
		NodeInfo next;

		public NodeInfo(int data) {
			this.data = data;
			this.next = null;
		}

	}

	NodeInfo addBegin(int data) {
		NodeInfo temp = new NodeInfo(data);
		temp.next = head;
		head = temp;
		return head;
		// temp

	}

	void display(NodeInfo obj) {
		// obj=this.head;
		while (null != obj) {
			System.out.println("LLNew.display()" + obj.data);
			obj = obj.next;

		}
	}

	void addAtEnd(NodeInfo object, int data) {
		while (null != object.next) {
			object = object.next;
		}
		NodeInfo nodeAtLast = new NodeInfo(data);
		// here we are not accessing null...we are assigning null to a new value
		object.next = nodeAtLast;

	}
	int searchElementAtMiddleMethodOne(NodeInfo node){
		int a=countNodes(node)/2;
		int b=0;
		while (b<=a) {
			if (b==a) {
				return node.data;
				
			}
			b++;
			node=node.next;
			
		}	
		return -1;
	}
	int searchElementAtMiddleMethodTwo(NodeInfo node){
		
		NodeInfo fast=node;
		NodeInfo slow=node;
		while (null!=fast&&null!=fast.next) {
			fast=fast.next.next;
			slow=slow.next;
			
		}
		
		return slow.data;
	}

	boolean searchIterative(NodeInfo object, int data) {
		// int mid=countNodes(object)/2;

		while (null != object) {
			if (data == object.data) {
				return true;

			}
			object = object.next;
		}
		return false;

	}
	boolean searchRecursive(NodeInfo object, int data) {
	if (null==object) {
		return false;
	}
	 if (object.data==data) {
		return true;
	}
     return searchRecursive(object.next, data);
	}

	int countNodes(NodeInfo object) {
		int count = 0;
		while (null != object) {
			count++;
			object = object.next;
		}
		return count;

	}

	public static void main(String[] args) {
		//
		LLNew linkList = new LLNew();
		// System.out.println("LLNew.main()"+linkList);
		System.out.println("linkList.head" + linkList.head);
		// first declare nodes
		NodeInfo first = new NodeInfo(1);
		linkList.head = first;
		NodeInfo second = new NodeInfo(2);
		linkList.head.next = second;
		NodeInfo third = new NodeInfo(3);
		second.next = third;
		linkList.addBegin(0);
		linkList.addAtEnd(linkList.head, 12);
		linkList.display(linkList.head);
	//	System.out.println("count " + linkList.countNodes(linkList.head));
		
		//displayIterativeSearchResult(linkList);
		//displayRecursiveSearchResult(linkList);
		//System.out.println("The midddle node is "+linkList.searchElementAtMiddleMethodOne(linkList.head));
		System.out.println("The midddle node is "+linkList.searchElementAtMiddleMethodTwo(linkList.head));

	}

	private static void displayRecursiveSearchResult(LLNew linkList) {
		if (linkList.searchRecursive(linkList.head, 3)) {
			System.out.println("Node present");
			
		}
		else{
			System.out.println("Node not present");
		}
			
	}

	private static void displayIterativeSearchResult(LLNew linkList) {
		if (linkList.searchIterative(linkList.head, 3)) {
			System.out.println("Node present");
			
		}
		else{
			System.out.println("Node not present");
		}
	}

}
