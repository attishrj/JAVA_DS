package com.java.newthread;

public class BankDemo {
	static int NUMCUST=10;

	public static void main(String[] args) {
		
		Account account=new Account();
		Customer[] customer=new Customer[NUMCUST];
		
		try {
			System.out.println("setting ");
			for (int i = 0; i < customer.length; i++) {
				customer[i]=new Customer(account);
				customer[i].start();
				
			}
			System.out.println("getting ");
			for (int i = 0; i < customer.length; i++) {
				customer[i].join();
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("acc "+account.getBalance());
	}

}
