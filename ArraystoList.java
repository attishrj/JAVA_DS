package com.ques.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraystoList {
	public static void main(String[] args) {
		int[] ar={2,25,26,69};
		int start=0;
		int end=ar.length-1;
		while(start<end)
		{
			int temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
		
		System.out.println(ar);
	}

}
