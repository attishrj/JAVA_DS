package com.java.newthread;

public class Account {
	private int balance=0;
	synchronized public void deposit(int amount){
		balance+=amount;
	}
	public int getBalance() {
		return balance;
	}

}
