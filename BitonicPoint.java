package com.learn.data.structure;

/**
 * Find the maximum element in an array which is first increasing and then
 * decreasing
 * 
 * Given an array of integers which is initially increasing and then decreasing,
 * find the maximum value in the array.
 */

public class BitonicPoint {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 50, 10, 9, 7, 6 };
		System.out.println("BitonicPoint.main()" + bitPoint(arr, 0, arr.length - 1));
		//BitonicIndex index=new BitonicIndex();
	}

	private static int bitPoint(int[] arr, int low, int high) {
		if (low == high) {
			return arr[low];
		}
		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				return arr[low];
			} else
				return arr[high];
		}
		int mid = (high + low) / 2;
		if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
			return arr[mid];
		}
		if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
			return bitPoint( arr,  low,  mid);
		}
		else
			return	bitPoint( arr,  mid+1,  high);
	}
	public static int bitPointIndex(int[] arr, int low, int high) {
		if (low == high) {
			return low;
		}
		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				return low;
			} else
				return high;
		}
		int mid = (high + low) / 2;
		if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
			return mid;
		}
		if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
			 bitPoint( arr,  low,  mid);
		}
		else
				bitPoint( arr,  mid+1,  high);
		return mid;
	}
}
