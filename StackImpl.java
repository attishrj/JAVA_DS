package com.learn.data.structure;

import java.util.Scanner;

public class StackImpl {
	int[] ar;
	int top;
	int maxSize;

	public StackImpl(int[] ar) {
		this.ar = ar;
		maxSize=ar.length;
		top=-1;
	}
	
	boolean isEmpty(){
		return top<0;
	}
	
	 boolean push(int x){
		 if (top>=maxSize-1) {
			 System.out.println("Stack Overflow");
			 return false  ;
			
		}
		 else{
			 ar[++top]=x;
			 System.out.println(x+"Pushed into stack");
			 return true;
		 }
		
	}
	 
	 private int pop() {
		 if (top<0) {
			 System.out.println("Stack UnderFlow");
			return -1;
		}
		 else{
			 int x=ar[top--];
			 System.out.println("The element popped is "+x);
			 return x;
		 }
		 
		 
	 }

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size = Utility.intialInput(in);
	    int array[]=new int[size];
	    StackImpl obj=new StackImpl(array);
	    obj.push(1);
	    obj.push(55);
	    obj.push(21);
	    obj.push(3);
	   obj.pop();
	   obj.pop();
	   obj.pop();
	   obj.pop();
	   obj.pop();
	    
		//Utility.inputArray(in, array);

	}

}
