/**
 * 
 */
package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


import com.learn.data.structure.Utility;

/**
 * ADD elements in the array only when i+1 and i-1 element are not in the existing list
 * i.e suppose 3 8 7 12 are there
 * add 3,7,12
 *  
 *  
 *
 */
public class SumofARRAY {
	public static int getSum(int []ar){
		Arrays.sort(ar);
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<ar.length-1;i++)
		{
			int curelem=ar[i];
			int next=curelem+1;
			int prev=curelem-1;
			{
				if(next!=ar[i+1]&&prev!=ar[i+1])
				{
					set.add(ar[i]);
				}
			}
		}
		set.add(ar[ar.length-1]);
		
		return calcSum(set);
		
	}

	private static int calcSum(Set<Integer> set) {
		Iterator<Integer> itr=set.iterator();
		int sum=0;
		while(itr.hasNext())
		{
			sum+=itr.next();
		}
		return sum;
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	int size = Utility.intialInputBuff(reader);
	int ar[]=new int[size];
	Utility.inputArrayBuff(reader, ar);
	System.out.println("Sum of set is"+getSum(ar));
	

	}

}
