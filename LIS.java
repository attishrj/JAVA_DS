/**
 * 
 */
package com.ques.hackerrank;

import java.util.Scanner;

import com.learn.data.structure.Utility;

/**
 * Longest Increasing Sub-Sequence
 *
 */
public class LIS {
	int ar[];

	public LIS(int[] ar) {
		this.ar = ar;
	}

	private int mis(int[] array, int length) {
		int[] newAr=new int[length];
		int i ,j,max=0;
		for ( i = 0; i < length; i++) {
			
			newAr[i]=1;
		}
		for (i = 1; i < length; i++) {
			for (j = 0; j < i; j++) {
				if (array[i] > array[j] && newAr[i] < newAr[j] + 1) {
					newAr[i] = newAr[j] + 1;
				}

			}

		}
		for (int k = 0; k < length; k++) {
			if (max<newAr[k]) {
				max=newAr[k];
				
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size = Utility.intialInput(in);
	    int array[]=new int[size];
	    LIS obj=new LIS(array);
	    Utility.inputArray(in, array);
	    System.out.println("Length of lis is "+  obj.mis(array,array.length));
    } 
	


}
