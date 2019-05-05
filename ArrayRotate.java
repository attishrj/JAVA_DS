package com.ques.hackerrank;

import com.learn.data.structure.Utility;

public class ArrayRotate {
	public static int[] reverse(int[] array,int start,int end)
	{
		while(start<end)
		{
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		return array;
	}
	
	public static void rightrotate(int[] array,int start,int end,int rotationDegree)
	{
		//A=n-r
		//B=r
		int net = end-rotationDegree;
		reverse(array, start, net);
		reverse(array, net+1, end);
		reverse(array, start, end);
		   
	}
	
	public static void left(int[] array,int start,int end,int rotationDegree)
	{
		//A=n-r
		//B=r
		reverse(array, start, rotationDegree-1);
		reverse(array, rotationDegree, end);
		reverse(array, start, end);
		   
	}
	


		public static void main(String[] args) {
     int[] ar={1,2,3,4,5,6,7};	
     int DOR=2;
   //  ArrayRotate.rightrotate(ar, 0, ar.length-1,DOR);
     ArrayRotate.left(ar, 0, ar.length-1,DOR);
     
     Utility.print(ar);

		}
}
