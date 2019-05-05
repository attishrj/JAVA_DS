package com.learn.data.structure;

import java.util.Scanner;

public class QuickSort {
	 int ar[];

	public QuickSort(int ar[]) {
		this.ar=ar;
	}

	 static int partition(int ar[],int low,int high){
		int x=ar[high];
		int i=low-1;
		int j;
		
		for ( j = low; j < high; j++) {
			 // If current element is smaller than or 
            // equal to pivot 
			if (ar[j]<=x) {
				i=i+1;
				int temp=ar[j];
				ar[j]=ar[i];
				ar[i]=temp;
				 
			}
		}
		 int temp = ar[i+1]; 
	        ar[i+1] = ar[high]; 
	        ar[high] = temp; 
	  
			return i+1;
	
	}
	 public static	void quickSort(int ar[],int low,int high){
		if (low < high) 
        { 
		int part=partition(ar, low, high);
		quickSort(ar, low, part-1);
		quickSort(ar, part+1, high);
        }
	}
	
	 int partition2(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than or 
	            // equal to pivot 
	            if (arr[j] <= pivot) 
	            { 
	                i++; 
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	  
	  
	    /* The main function that implements QuickSort() 
	      arr[] --> Array to be sorted, 
	      low  --> Starting index, 
	      high  --> Ending index */
	    void sort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(arr, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	    } 
	  
	    public  void disp(int ar[]) {
			System.out.println("The elements are ");
			for (int i = 0; i < ar.length; i++) {
				System.out.println(" " + ar[i]);

			}
	    }
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size = Utility.intialInput(in);
	    int array[]=new int[size];
	    QuickSort sort=new QuickSort(array);
		Utility.inputArray(in, array);
		quickSort(array, 0, array.length-1);
		//sort.sort(array, 0, array.length-1);
		Utility.disp(array);
		

	}

	
}
