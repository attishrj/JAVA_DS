package com.java.basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	private List<Integer> list;


	public ListDemo() {
		System.out.println(this);
		// TODO Auto-generated constructor stub
		list=new ArrayList<Integer>();
	}
	
	public List<Integer> getList() {
		return list;
	}
	
	void init(){
		list.add(0,51);
		list.add(1,31);
		list.add(2,21);
		list.add(3,71);
		list.add(4,41);
		list.add(5,1);
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
		
		ListDemo obj=new ListDemo();
		obj.init();
		System.out.println("before sorting");
		obj.display();
		Collections.sort(obj.getList());
		System.out.println("after sorting");
		obj.display();

	}

}
