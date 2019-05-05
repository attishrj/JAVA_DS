package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(100, "Amit");
		hmap.put(101, "Vijay");
		hmap.put(102, "Rahul");
		hmap.put(103   , "RahulK");
		System.out.println(hmap.get(106));
		Collection<String> values = hmap.values();
		Set<Entry<Integer, String>> listt=hmap.entrySet();
	List<String> list=new ArrayList<>(values);
Iterator<String> iterator = list.iterator();
while(iterator.hasNext())
{
	String next = iterator.next();
	System.out.println(next);
	}
		System.out.println(values);
	
	for(Map.Entry<Integer,String> m:hmap.entrySet())
	{
		  System.out.println(m.getKey()+" "+m.getValue()); 
	}

}
}
