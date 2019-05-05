/**
 * 
 */
package com.java.newthread;

/**
 * More about synchronized 
 *
 */
public class SyncDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display d=new Display();
		SyncAct act=new SyncAct(d, "Dhoni");
		SyncAct act2=new SyncAct(d, "Yuvraj");
		SyncAct act3=new SyncAct(d, "Raina");
		SyncAct act4=new SyncAct(d, "Kohli");
		act.start();
		act2.start();
		act3.start();
		act4.start();
		
		

	}

}
