package com.java.basics;

public class TryDemo  {
	String str="a";
	void A()
	{
		try {
			str+="b";
			B();
			
		} catch (Exception e) {
			str+="c";
		}
	}
	private void B() throws Exception{
		try {
			str+="d";
			C();
		} catch (Exception e) {
			throw new Exception();
		}
		finally {
			str+="e";
			
		}
		str += "f";
		
	}
	private void C()  throws Exception {
		throw new Exception();
		
	}
	 void display()
	    {
	        System.out.println(str);
	    }
	public static void main(String[] args) {
		TryDemo object=new TryDemo();
		object.A();
        object.display();
		
		try {
			throw new MyException("custom made exception");
			
		} catch (MyException e) {
			System.out.println("exception caught");
		}
		finally {
			System.out.println("In finally ");
			
		}
		
		
	}

}
