package com.ques.hackerrank;

import java.util.Scanner;

import com.learn.data.structure.Utility;

public class KadaneAlgo {
	private int[] ar;

	public KadaneAlgo(int[] ar) {
		this.ar = ar;
	}

	private int algoImpl(int[] arr, int size) {
		int max_so_far=arr[0];
		int max_ending_here=0;
		int end=0;int start=0,s = 0;
		for (int i = 0; i <size; i++) {
			max_ending_here=max_ending_here+arr[i];
			if (max_so_far<max_ending_here) {
				max_so_far=max_ending_here;
				start = s; 
                end = i; 
				
			}
			if (max_ending_here<0) {
				max_ending_here=0;
				s = i + 1; 
				
			}
			
		}
		System.out.println("max sum is "+max_so_far);
		 System.out.println("Starting index " + start); 
	        System.out.println("Ending index " + end); 
   return max_so_far;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = Utility.intialInput(in);
		int ar[] = new int[size];
		KadaneAlgo obj = new KadaneAlgo(ar);
		Utility.inputArray(in, ar);
		int len = ar.length;
		obj.algoImpl(ar, len);
		//Utility.disp(ar);

	}

}
