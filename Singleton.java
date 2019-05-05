package com.java.basics;

public class Singleton {
	
	private static Singleton obj;
	public String s,s1;
	
	private Singleton() {
		s="Hello";
		s1=" am there";
		System.out.println(s.concat(s1));
	}
	public static Singleton getInstance()
	{
		if(null==obj)
		{
			obj=new Singleton();
		}
		return obj;
		
	}
	
	
	

}
