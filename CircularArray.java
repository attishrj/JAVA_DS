package com.learn.data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Utility.intialInputBuff(reader);
		int[] ar = new int[size];
		Utility.inputArrayBuff(reader, ar);
		System.out.println("Enter the index");
		int index = Integer.parseInt(reader.readLine());
		print(ar, size, index);

	}

	private static void print(int[] ar, int n, int i) {
		for (int j = i; j < n + i; j++) {
			int j2 = j % n;
			System.out.println("  " + ar[j2]);

		}

	}

}
