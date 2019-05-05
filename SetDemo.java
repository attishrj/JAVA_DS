package com.java.basics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {


	private Set<String> hash_Set = new HashSet<String>();
	private Set<Integer> hash_int = new HashSet<Integer>();


	public SetDemo() {
		// TODO Auto-generated constructor stub
		hash_Set=new HashSet<String>();
		hash_int=new HashSet<Integer>();
	}
	
	public Set<String> getSet() {
		return hash_Set;
	}
	
	void init(){
		 hash_Set.add("Geeks"); 
	        hash_Set.add("For"); 
	        hash_Set.add("Geeks"); 
	        hash_Set.add("Example"); 
	        hash_Set.add("Set"); 
	        }
	void init_int(){
		hash_int.add(12); 
		 hash_int.add(15); 
		 hash_int.add(12); 
		 hash_int.add(19); 
	        hash_int.add(19); 
	        }
	
	
	void display()
	{
	Iterator<String> iterator = hash_Set.iterator();
	while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		// System.out.println(hash_Set); 
	}
	void displayInt()
	{
	Iterator<Integer> iterator = hash_int.iterator();
	while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		// System.out.println(hash_Set); 
	}

	public static void main(String[] args) {
		
		SetDemo obj=new SetDemo();
		//obj.init();
		obj.init_int();
		System.out.println("before sorting");
		//obj.display();
		obj.displayInt();
		

	}





}
