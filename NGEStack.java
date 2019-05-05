package com.learn.data.structure;

import java.util.Scanner;

import javax.rmi.CORBA.Util;

/**
 * Next Greater
element*/
public class NGEStack {
	
	int maxSize;
	int ar[];
	int top;

	public int getTop() {
		return top;
	}

	public NGEStack(int[] ar) {
		this.ar = ar;
		this.maxSize=ar.length;
		this.top=-1;
		
	}
	
	boolean push(int x) {
		if (top >= maxSize - 1) {
			System.out.println("Stack overflow");
			return false;
		} else {
			ar[++top] = x;

			return true;
		}
	}
	
	int pop()
	{
		if (top<0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else{
			int x;
			x=ar[top--];
			return x;
		}
	}
	boolean isEmpty(){
		return (top==-1)?true:false;
	}
	
	void nge(int ar[], int size)
	{
		int i=0;
		int element,next=0;
		push(ar[0]);
		for ( i = 1; i < size; i++)
		{
			next=ar[i];
			if (!isEmpty()) {
			element=pop();
				
				while (!isEmpty() && element < next) {
					System.out.println(element + " --> " + next);
					if (isEmpty())
						break;
					element = pop();
				}
				if (element>next) {
					push(element);
				}
				push(next);
			}
			
		}
		while (!isEmpty())  
        { 
            element = pop(); 
            next = -1; 
            System.out.println(element + " -- " + next); 
        } 
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size = Utility.intialInput(in);
	    int array[]=new int[size];
	    Utility.inputArray(in, array);
	    NGEStack nge=new NGEStack(array);
	    nge.nge(array, array.length);
	    Utility.disp(array);
	}

}
