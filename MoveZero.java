package com.ques.hackerrank;

import java.util.Scanner;

import com.learn.data.structure.Utility;

public class MoveZero {
	int[] ar;

	public MoveZero(int[] ar) {
		this.ar=ar;
	}

	private void seggarateZeroATEND(int[] a) {
		int size=a.length;
		int count=0;
		
		
		for (int i = 0; i < size; i++) {
			if (a[i]!=0) {
				a[count]=a[i];
				count++;
			}
			
		}
		for (int i=count; i < a.length; i++) {
			a[i]=0;
			
		}
		
	}


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); 
		int size=Utility.intialInput(in);
		int ar[]=new int[size];
		MoveZero geeks=new MoveZero(ar);
		Utility.inputArray(in, ar);
	//	geeks.seggarateZeroATEND(ar);
		geeks.seggarateZeroATFront(ar);
		Utility.disp(ar);

	}

	private void seggarateZeroATFront(int[] arr) {
		
		seggarateZeroATEND(arr);
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

	

}
