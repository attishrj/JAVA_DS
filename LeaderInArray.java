package com.ques.hackerrank;

import java.util.Scanner;

import com.learn.data.structure.Utility;

public class LeaderInArray {
	private int[] ar;

	public LeaderInArray(int[] ar) {
     this.ar=ar;	
}
	private void leader(int[] ar,int size) {
		//int size = ar.length;
		for (int i = 0; i <size; i++) {
			int j=i+1;
			for (; j< size; j++)
			{
				if (ar[j]>=ar[i]) 
				{
					break;
					
				}
			}
			if (j==size) {
				System.out.println("LeaderInArray.leader() is "+ar[j]);
				
			}
			
				
			}
		
		
	}
	private void leaderOpt(int[] ar,int size) {
		int max = ar[size-1];
		for (int i = size-2    ; i>0; i--) {
			if (max<ar[i]) {
				max=ar[i];
				
			}
			
				
			}
		System.out.println("LeaderInArray.leader() is "+max);
		
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); 
		int size=Utility.intialInput(in);
		int ar[]=new int[size];
		LeaderInArray geeks=new LeaderInArray(ar);
		Utility.inputArray(in, ar);
		int len=ar.length;
		//geeks.leader(ar,len);
		geeks.leaderOpt(ar, len);
		Utility.disp(ar);
		

	}


}
