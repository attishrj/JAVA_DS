package com.java.newthread;

public class RunVsStart   extends Thread {
	public RunVsStart() {
		// TODO Auto-generated constructor stub
	}

	
	public void run() {
		System.out.println("Current thread "+Thread.currentThread().getName());
		System.out.println("run() is called");
	}

	/*@Override
	public synchronized void start() {
		System.out.println("overidden start() is called");
	}*/
}
