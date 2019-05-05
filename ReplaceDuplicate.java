package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.learn.data.structure.Utility;

public class ReplaceDuplicate {
	int ar[];
	

	public ReplaceDuplicate(int[] ar) {
		this.ar = ar;
	}
	
	public  void removeDup(int ar[]){
		int n=ar.length;
		for(int i=0;i<n-1;i++)
		{
			int temp=ar[i];
			for(int j=i+1;j<n;j++)
			{
				if(temp==ar[j])
				{
					ar[j]=1;
					ar[i]=1;
				}
			}
		}
		separate(ar, n);
	}
		public int[] separate(int ar[],int size)
		{
			int j=size-1;
			for(int i=size-1;i>=0;i--)
			{
				if(ar[i]!=1)
				{
					ar[j--]=ar[i];
				}
				
			}
			
			while(j>=0)
			{
				ar[j--]=1;
			}
			return ar;
			
		}
					
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int size=Utility.intialInputBuff(reader);
		int[] ar=new int[size];
		ReplaceDuplicate obj=new ReplaceDuplicate(ar);
		Utility.inputArrayBuff(reader, ar);
		obj.removeDup(ar);
		Utility.disp(ar);
		

	}

}
