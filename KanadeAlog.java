package com.learn.data.structure;

import java.util.Scanner;

public class KanadeAlog {
	 int ar[];
	 
	
	public KanadeAlog(int[] ar) {
		this.ar = ar;
	}
	
	void input(Scanner in) {
	      System.out.println("Enter the elements");
			for (int i = 0; i < ar.length; i++) {
				ar[i] = in.nextInt();
			}
		}
		
	void disp() {
		System.out.println("The elements are ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(" " + ar[i]);

		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int ar[]=new int[size];
		KanadeAlog obj=new KanadeAlog(ar);
		obj.input(sc);
		obj.disp();
		
		KanadeAlog.maxSubArray(ar);
		
	}

	private static void maxSubArray(int[] arr) {
		int max_so_far=Integer.MIN_VALUE;
		int max_end=0;
		int s=0 ;
		 int start=0;
		 int end=0;
		for (int i = 0; i < arr.length; i++) {
			max_end=max_end+arr[i];
			
			if (max_end<0) {
				max_end=0;
				s= i+1;
				
			}
			if (max_so_far < max_end)  
            { 
                max_so_far = max_end; 
                 start = s; 
                 end = i; 
            } 
		}
		
		System.out.println("Maximum contiguous sum is " 
                + max_so_far); 
     System.out.println("Starting index " + start);  
      System.out.println("Ending index " + end);
	}

}
