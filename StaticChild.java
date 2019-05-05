package com.java.basics;

public class StaticChild extends StaticParent {

	public StaticChild() {
		System.out.println("  in child ");
	}
	public static void  A(){
		System.out.println("child in StaticChild .A()");
	}
	
	public static void main(String[] args) {
		StaticParent child=new StaticChild();
		A();
		
	}

}
