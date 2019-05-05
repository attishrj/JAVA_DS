package com.learn.data.structure;

//latest
public class Qsort {
	
	public static int partition(int[] arr,int low, int high){
		int key=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=key)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void main(String[] args) {
		
		int []ar={9,6,5,0,8,2,4,7};
		Qsort.sort(ar,0,ar.length-1);
		Utility.print(ar);
		
		
	}
	public static void sort(int[] ar, int low, int high) {
		if(low<high)
		{
			int part=partition(ar, low, high);
			System.out.println("Partition is   "+part);
			System.out.println("After partion array is \n");
			Utility.print(ar);
			sort(ar,low,part-1);
			sort(ar,part+1,high);
		}
		
	}

}
