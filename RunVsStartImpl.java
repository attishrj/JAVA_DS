package com.java.newthread;

public class RunVsStartImpl {

	public static void main(String[] args) {
		RunnableY runnableY=new RunnableY();
		Thread t=new Thread(runnableY);
		Thread t2=new Thread();
		   RunVsStart mythread=new RunVsStart();
     mythread.start();
     System.out.println("Run followed--");
     mythread.run();


    System.out.println("----------");
     System.out.println("----------");
     t.start();
     System.out.println("--fol-------");
     System.out.println("----------");
     t2.start();
     runnableY.run();  	
	}

}
