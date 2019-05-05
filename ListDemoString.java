package com.java.basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemoString {

	private List<String> list;


	public ListDemoString() {
		// TODO Auto-generated constructor stub
		list=new ArrayList<String>(3);
	}
	
	public List<String> getList() {
		return list;
	}
	
	void init(){
		list.add("abc");
		list.add("alphabet");
		list.add("xylem");
		list.add("phoenix");
		list.add("zebra");
		list.add("hello");
	}
	
	void display()
	{
//		Iterator<Integer> iterator = list.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		for (int i=0;i<list.size();i++) {
			System.out.println("index ="+i+"="+list.get(i));
			
		}
	}

	public static void main(String[] args) {
		
		ListDemoString obj=new ListDemoString();
		obj.init();
		System.out.println("before sorting");
		obj.display();
		Collections.sort(obj.getList());
		System.out.println("after sorting");
		obj.display();

	}



}
