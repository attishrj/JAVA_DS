package com.java.basics;

import com.java.thread.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		//main thread  creates child thread object
		//called thread instantioan
     MyThread t=new MyThread();
     t.run();
     t.start();// starting of thread
     
     
     for (int i = 0; i <10; i++) {
    	 System.out.println("state of child thread"+ t.getState());
			
			System.out.println ("Main Thread " );
		}
		
	}

}
