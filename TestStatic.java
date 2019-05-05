package com.java.basics;

public class TestStatic {
	
	static int x=10;
	int y=20;
	static int print()
	{
		System.out.println("In static method");
		return x;
	}
	static int print(int x)
	{
		
		return print();
	}
	public static void main(String[] args) {
		print();
		TestStatic obj=new TestStatic();
		obj.x=125;
		main(new int[]{10,25});
		System.out.println(x);
	}
	public static void main(int[] args) {
		print();
		for (int i = 0; i < args.length; i++) {
			
		}
		
		System.out.println(x);
	}

}
