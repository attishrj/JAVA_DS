package com.learn.data.structure;

import java.util.Scanner;

public class SearchApplication {
	int size;
	 int ar[];
	

	public SearchApplication(int size) {
		this.size=size;
	
		this.ar = new int[size];
	}

	boolean linearSearch() {
		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					return true;

				}

			}
		}
		return false;

	}

	void input(Scanner in) {
      System.out.println("Enter the elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
	}
	
	void dup()
	{
		if (linearSearch()) {
			System.out.println("Duplicates present");
			
		}
		else{
			System.out.println("Duplicates not present");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SearchApplication obj=new SearchApplication( 5);
		obj.input(in);
		//obj.linearSearch();
		obj.dup();
		

	}

}
