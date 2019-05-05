package com.java.basics;

public class OuterIner {
	private int x=10;
	static int y=25;
	void outerM() {

		Inner i = new Inner();
		i.innerM();
	}
	public static void main(String[] args) {
		OuterIner outerIner = new OuterIner();
		OuterIner.Inner iobj=outerIner.new Inner();
		iobj.innerM();
		
	}

	public class Inner {
		int x=125;

		void innerM() {
			System.out.println("In static method"+"--"+OuterIner.this.x);

		}
	}

}
