package com.learn.data.structure;

public class BitonicIndex {
	public static void main(String[] args) {

		 int arr[] = {-8, 1, 2, 3, 4, 5, -2, -3}; 
	        int key = 1; 
	        int size, low, high; 
	        size = arr.length; 
	        low = 0; 
	        high = size - 1; 
	        int index=BitonicPoint.bitPointIndex(arr,low,high);
	        int x = searchBitonic(arr, size, key, index); 
	        

	        
	        if (x == -1) { 
	            System.out.println("Element Not Found"); 
	        } else { 
	            System.out.println("Element Found at index " + x); 
	        } 

}
	 static int searchBitonic(int arr[], int n, int key, int index) { 
	        if (key > arr[index]) { 
	            return -1; 
	        } else if (key == arr[index]) { 
	            return index; 
	        } else { 
	            int temp = ascendingBinarySearch(arr, 0, index - 1, key); 
	            if (temp != -1) { 
	                return temp; 
	            } 
	  
	            // Search in right of k  
	            return descendingBinarySearch(arr, index + 1, n - 1, key); 
	        } 
	    } 

	private static int descendingBinarySearch(int[] arr, int low, int high,int key) {
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==key)
			{
				  
		                return mid;
			}
			if(arr[mid]<key)
			{
				high=mid-1;
			}
			else{
				low=low+1;
			}
		}
		return -1;
	}

	private static int ascendingBinarySearch(int[] arr, int low, int high,int key) {
		int mid=low+(high-low)/2;
		if(arr[mid]==key)
		{
			  
	                return mid;
		}
		if(arr[mid]>key)
		{
			high=mid-1;
		}
		else{
			low=low+1;
		}
			  
		return -1;  
			  
	}
}
