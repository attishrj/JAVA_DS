package com.java.basics;

public class DeriveException extends BaseException {

	public static void main(String[] args) {
		
		try {
			throw new DeriveException();
		}
		
		catch (BaseException base) {
			System.out.println("Caught base class exception"); 
		}
		
		catch (DeriveException derivee) {
			System.out.println("Caught base derived exception");
			
		}
	}
}
