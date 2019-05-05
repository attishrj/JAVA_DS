package com.ques.hackerrank;

import java.util.Scanner;

import com.learn.data.structure.Utility;

public class ArrayConsecutive {
	int ar[];

	public ArrayConsecutive(int[] ar) {
		this.ar = ar;
	}
	
	
	void consecutive(int ar[])
	{
		int n=ar.length;
		if(max(ar)-min(ar)+1==n)
		{
			System.out.println("arrays are consecutive");
		}
		
	}

	private int min(int[] ar2) {

		int min=ar2[0];
		for (int i = 0; i < ar2.length; i++) {
			if (ar[i]<=min) {
				min=ar[i];
				
			}
			
		}
		return min;
	
	}

	private int max(int[] ar2) {
		int max=ar2[0];
		for (int i = 0; i < ar2.length; i++) {
			if (ar[i]>=max) {
				max=ar[i];
				
			}
			
		}
		return max;
	}
	public void sumconseutive(int ar[]){
		int sum=0;
		for (int i = 0; i+1 < ar.length; i++) {
			sum=ar[i]+ar[i+1];
			//sumArray=sumArray[i]+sum;
			System.out.println(" "+sum);
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size = Utility.intialInput(in);
	    int array[]=new int[size];
		ArrayConsecutive consecutive=new ArrayConsecutive(array);
		Utility.inputArray(in, array);
		//QuickSort.quickSort(array, 0, array.length-1);
		//Utility.disp(array);
		//consecutive.consecutive(array);
		//consecutive.sumconseutive(array);
		Utility.reverse(array);
		Utility.disp(array);

	}

	
}
