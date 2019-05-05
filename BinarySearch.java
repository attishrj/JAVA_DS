 package com.learn.data.structure;

import java.util.Scanner;

public class BinarySearch {
	int ar[];;
	int num;
	int size;

	public BinarySearch(int size) {
		super();
		this.size = size;
		this.ar = new int[size];
	}

	void input(Scanner sc) {
		System.out.println("enter the elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
	}

	void inputSearchElement(Scanner sc) {
		System.out.println("Enter the element to be searched");
		num = sc.nextInt();
	}

	void disp() {
		System.out.println("The elements are ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(" " + ar[i]);

		}
	}

	boolean binarySearch() {
		int low = 0;
		int high = ar.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (ar[mid] == num) {
				System.out.println("The index of the searched element  ");
				return true;

			}
			if (num < ar[mid]) {
				high = mid - 1;

			} else {
				low =mid  + 1;
			}

		}
		return false;
	}
	
	boolean recursiveBinary(int low,int high)
	{  
		int mid=low+(high-low)/2;
	
		if (num==ar[mid]) {
			System.out.println("The index of the searched element  ");
			return true;
		}
		if (num<ar[mid]) {
			recursiveBinary(low, mid-1);
		}
		else{
			recursiveBinary(low+1, high);
		}
		return false;
	}

	void result() {
		if (!recursiveBinary(0, ar.length)) {
			System.out.println("search not found");

		}

	}

	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch(9);
		Scanner sc = new Scanner(System.in);
		obj.input(sc);
		obj.disp();
		obj.inputSearchElement(sc);
		obj.result();

	}

}
