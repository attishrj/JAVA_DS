package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PermutationString {

	static int fact(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return (number * fact(number - 1));
	}

	static int permute(int n, int r) {
		return ((fact(n)) / fact(n - r));
	}

	public void getPermutationString(String str, int start, int end) {
		Set<String> set=new HashSet<>();
		if (start == end) {
			set.add(str);
		  Iterator<String> itr=set.iterator();
		  while (itr.hasNext()) {
			String stitr =  itr.next();
			
			System.out.println(stitr);
		}
		} else {
			for (int i = start; i <=end; i++) {
				str = swap(str, start, i);
				getPermutationString(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
	}

	private  String swap(String str, int start, int i) {
		char[] chArray = str.toCharArray();
		char temp;
		temp = chArray[start];
		chArray[start] = chArray[i];
		chArray[i] = temp;
		return String.valueOf(chArray);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * System.out.println("Enter the number "); int
		 * n=Integer.parseInt(reader.readLine());
		 * System.out.println("Enter the no of ways "); int
		 * r=Integer.parseInt(reader.readLine());
		 * System.out.println("The permutation of "+n+"and "+r+" is "+permute(n,
		 * r));
		 */
		PermutationString obj=new PermutationString();
		System.out.println("Enter the string ");
		String str = reader.readLine();
		obj.getPermutationString(str, 0, str.length() - 1);

	}

}
