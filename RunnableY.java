package com.java.newthread;

public class RunnableY implements Runnable {

	@Override
	public void run() {
		System.out.println("Current thread "+Thread.currentThread().getName());
		System.out.println("in run() is called");
		
	}

}
