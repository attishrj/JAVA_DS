package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.learn.data.structure.Utility;

public class DuplicatesinArray {
	int[] ar;
	
	
	public DuplicatesinArray(int[] ar) {
		this.ar = ar;
	}
	public int[] countDupElem(int[] ar,int size)
	{
		int[] res = new int[ar.length];
		Arrays.sort(ar);
		int j = 0;
		int counter = 0;
		for (int i = 0; i < size; i++) {
			int temp = ar[i];
			if (temp == ar[i+1]) {
				res[j++] = ar[i];
				counter++;
			}

		}
		if (counter == 0) {
			res[0] = -1;
		}

		return res;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); 
	int size=Utility.intialInputBuff(reader);
	int ar[]=new int[size];
	Utility.inputArrayBuff(reader, ar);
	DuplicatesinArray obj=new DuplicatesinArray(ar);
	int[] res=obj.countDupElem(ar,size-1);
	Utility.disp(res);
	
	}

}
