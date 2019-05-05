package com.java.basics;

public class MethodOuter {
	void outerMethod() {
		int x=9;
		class MethodInner {
			void innerMethod() {
				
				System.out.println("inside innerMethod"+x);
			}
		}
		MethodInner y=new MethodInner();
		y.innerMethod();
	}
	
	public static void main(String[] args) {
		MethodOuter obj=new MethodOuter();
		obj.outerMethod();
	}

}
