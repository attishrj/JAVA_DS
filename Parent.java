package com.java.basics;
import java.io.IOException;

public class Parent extends GrandParent {
	public Parent() {
		System.out.println("Parent Constructor");
	}
	  void method() throws IndexOutOfBoundsException, IOException 
    { 
        System.out.println("P ::show() called"); 
    } 

}
