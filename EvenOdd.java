package com.ques.hackerrank;

import java.util.Arrays;

import com.learn.data.structure.Utility;

/**
 * Given an array A of n elements, sort the array according to the following
 * relations :
 * 
 * Rearrange array such that even positioned are greater than odd
 * 
 * 
 * 
 * since it has to sorted order so, right element will be greater than left
 */

/*   */

public class EvenOdd {
	public static int[] check(int[] ar) {
		int []res=new int[ar.length];
		int start=0;
		int end=ar.length-1;
		for (int i = 0; i < ar.length; i++) {
			if ((i+1)%2==0) {
				res[i]=ar[end--];
				
				
			}
			else{
				res[i]=ar[start++];
			}

		}
		return res;
	}

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3};
		Arrays.sort(ar);
		//123457
		//123==132
		
		Utility.print(EvenOdd.check(ar));

	}
}
