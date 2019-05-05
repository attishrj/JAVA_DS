package com.abstractinfo.and.interfaceinfo;

public class Person {
	private String name;
	 public Person(String name) { 
		 this.name = name;
		 }
	public boolean equals(Person p) {

	 return p.name.equals(this.name);
	}
	public void disp()
	{
		System.out.println("hell");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("here");
		return super.equals(obj);
	}
	public static void main(String[] args) {
		Person person=new Person("abc");
		assert args.length == 1;
	//	System.out.println(assert args.length == 1);
		person.disp();
		//person.e
		

	}

}
