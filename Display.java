/**
 * 
 */
package com.java.newthread;

/**
 * More about synchronized 
 * later making it sync
 * (i)normal
 * (ii)synchronized
 * (iii)static synchronized
 */
public class Display {
	
	public static synchronized void wish(String name)
	{
		System.out.print(" Good Morning  ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
	}

}
