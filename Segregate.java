package com.ques.hackerrank;

import com.learn.data.structure.Utility;

/**
Segregate even and odd numbers*/
/*
Input : 1 9 5 3 2 6 7 11
Output : 2 6 5 3 1 9 7 11*/

public class Segregate {
	int[] seggr(int[] ar){
		
		int[] result=new int[ar.length];
		int count = 0,j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				result[j++]=ar[i];
				count++;
			}
			
		}
		for (int i=0;i<ar.length;i++) {
			if(ar[i]%2!=0)
			{
				result[j++]=ar[i];
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		Segregate obj=new Segregate();
		
		int[] ar={1 ,9, 5 ,3 ,2 ,6 ,7, 11};
		Utility.disp(obj.seggr(ar));
		// TODO Auto-generated method stub

	}

}
