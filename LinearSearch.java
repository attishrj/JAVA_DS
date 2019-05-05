package com.ques.hackerrank;

import java.util.Scanner;

public class LinearSearch {

	int size;
	int ar[] ;;
	int num;
	public LinearSearch(int size) {
		
		this.size = size;
		this.ar=new int[size];
	}



	void input(Scanner sc) {
        System.out.println("enter the elements");
		for (int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();

		}
	}
	
	void inputSearchElement(Scanner sc)
	{
		System.out.println("Enter the element to be searched");
		num=sc.nextInt();
	}
	void disp()
	{
		System.out.println("The elements are ");
		for (int i = 0; i<ar.length; i++) {
		System.out.println(" "+ar[i]);

		}
	}
	
	boolean searchFound() {
		for (int i : ar) {

			if (num == i) {

				System.out.println("The index of the searched element  " + i);
				return true ;

			}

			
		}
		return false;

	}
	void result()
	{
		if (!searchFound()) {
			System.out.println("search not found");
			
		}
		
	}
	

public static void main(String[] args) {
	LinearSearch obj=new LinearSearch(5);
	Scanner sc =new Scanner(System.in);
	obj.input(sc);
	obj.disp();
	obj.inputSearchElement(sc);
	obj.searchFound();
	obj.result();
	sc.close();
	
	
	
}

}
