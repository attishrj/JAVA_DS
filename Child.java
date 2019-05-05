package com.java.basics;
import java.io.IOException;

public class Child extends Parent{
	
	@Override
	protected void method() throws IOException{
		// TODO Auto-generated method stub
		super.super.method();
		 System.out.println("Child::show() called");
    }
	
	
	
	public static void main(String[] args) throws IOException {
		Child obj=new Child();
		obj.method();
		//method();
		
	}

}
