package com.learn.data.structure;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack;
	Stack<Integer> stack2;
	public MinStack() {
		stack=new Stack<>();
		stack2=new Stack<>();
	}

	void push(int x)
	{
		stack.push(x);
		if (stack2.isEmpty()) {
			stack2.push(x);
		}
		else{
			stack2.push(Math.min(stack2.peek(), x));
		}
	}
	void pop()
	{
		stack.pop();
		stack2.pop();
	}
	int top()
	{
		return stack.peek();
	}
	int getMin()
	{
		System.out.println("min is   is "+stack2.peek());
		return stack2.peek();
	}
	public static void main(String[] args) {
	/*	Scanner in=new Scanner(System.in);
		int size = Utility.intialInput(in);
	    int array[]=new int[size];
	    
*/
		MinStack stack=new MinStack();
		stack.push(12);
		stack.push(9);
		stack.getMin();
		
	}

}
