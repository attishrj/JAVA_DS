package com.java.newthread;
/**
 * More about synchronized 
 *
 */

public class SyncAct extends Thread {
	Display d;
	String name;
	public SyncAct(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		Display.wish(name);
	}

}
