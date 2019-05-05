package com.learn.data.structure;

import java.util.Scanner;

public class InsertionSort {
	
	int size;
	 int ar[];
	

	public InsertionSort(int size) {
		this.size=size;
	
		this.ar = new int[size];
	}


	void input(Scanner in) {
      System.out.println("Enter the elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
	}
	


	
	void disp() {
		System.out.println("The elements are ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(" " + ar[i]);

		}
	}
	private void shellsort() {
		
		int n = ar.length; 
		  
        // Start with a big gap, then reduce the gap 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            // Do a gapped insertion sort for this gap size. 
            // The first gap elements a[0..gap-1] are already 
            // in gapped order keep adding one more element 
            // until the entire array is gap sorted 
             for (int i = gap; i < n; i += 1) 
            { 
                // add a[i] to the elements that have been gap 
                // sorted save a[i] in temp and make a hole at 
                // position i 
                int temp = ar[i]; 
  
                // shift earlier gap-sorted elements up until 
                // the correct location for a[i] is found 
                int j; 
                for (j = i; j >= gap && ar[j - gap] > temp; j -= gap) 
                    ar[j] = ar[j - gap]; 
  
                // put temp (the original a[i]) in its correct 
                // location 
                ar[j] = temp; 
            } 
        } 
        //204003
        return; 
		
		
	}
	void insertionSort() {
		for (int i = 1; i < ar.length; i++) {
			int key=ar[i];
			int j=i-1;
			while (j>=0&&key<ar[j]) {
				ar[j+1]=ar[j];
				j--;
				
			}
			ar[j+1]=key;
			
			
		}
		
		
	}

	public static void main(String[] args) {
		InsertionSort obj=new InsertionSort(9);
		Scanner sc=new Scanner(System.in);
	//	QuickSort qs=new QuickSort(3);
		obj.input(sc);
		obj.disp();
	//	obj.insertionSort();
		obj.shellsort();
		System.out.println("After sorting");
		obj.disp();

	}





}
