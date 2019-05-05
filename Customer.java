package com.java.newthread;

public class Customer extends Thread {
	Account account;
	public Customer(Account account) {
		this.account=account;
	}
	@Override
	public void run() {
		try {
			for (int i = 0; i <100; i++) {
				System.out.println("Customer.run()"+Thread.currentThread().getName());
				account.deposit(10);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
