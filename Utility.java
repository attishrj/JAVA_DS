package com.learn.data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public  class Utility {
	
	public static void inputArray(Scanner in,int ar[]) {
	      System.out.println("Enter the elements ");
			for (int i = 0; i < ar.length; i++) {
				ar[i] = in.nextInt();
			}
		}
	
	public static void inputArrayBuff(BufferedReader  reader,int ar[]) {
	      System.out.println("Enter the elements ");
			for (int i = 0; i < ar.length; i++) {
				try {
					ar[i] = Integer.parseInt(reader.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	public static int intialInputBuff(BufferedReader  reader) throws NumberFormatException, IOException {
		System.out.println("Enter the size of array ");
		int size=Integer.parseInt(reader.readLine());
		return size;
	}
	public static int intialInput(Scanner in) {
		System.out.println("Enter the size of array ");
		int size=in.nextInt();
		return size;
	}
	
	public static void disp(int ar[]) {
		System.out.println("The elements are ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(" element at "+i+" position " + ar[i]);

		}
	}
	public static void print(int ar[]) {
		//System.out.println("The elements are ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print("  " + ar[i]);

		}
	}
	
	
	public static void reverse(int ar[]) {
		int n = ar.length;
		int end = n - 1;
		int start = 0;
		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}

	}
	private static void sum(int[] ar) {
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum+=ar[i];
			
		}
		System.out.println("sum is "+sum);
		
	}
	public static int getMissingNo (int a[], int n) 
    { 
        int x1 = a[0];  
        int x2 = 1;  
          
        /* For xor of all the elements  
           in array */
        for (int i = 1; i < n; i++) 
        {
        	System.out.println("x1  "+x1);
        	System.out.println("a[i] "+a[i]);
        	
            x1 = x1 ^ a[i];
            System.out.println(" x1 ^ a[i] "+x1);
        }         
        /* For xor of all the elements  
           from 1 to n+1 */         
        for (int i = 2; i <= n+1; i++) 
            x2 = x2 ^ i;          
          
        return (x1 ^ x2); 
    } 
	public static void main(String[] args) {
		/*Scanner in=new Scanner(System.in);
		int size=intialInput(in);
		int ar[]=new int[size];
		inputArray(in, ar);
		sum(ar);
		int res=getMissingNo(ar, 5);
		System.out.println("Utility.main()"+res);*/
		String s1=new String("Durga");
		String s2=new String("RAVI");
		String s3=new String("Durga");
		String s4=s1;
		
		
		/*
		System.out.println("s1.hashCode()"+s1.hashCode());
		System.out.println("s3.hashCode()"+s3.hashCode());
		System.out.println("s4.hashCode()"+s4.hashCode());
		System.out.println("s1.equals(s3)"+s1.equals(s3));
		System.out.println("s1.equals(s4)"+s1.equals(s4));*/
	//	System.out.println("s1==s4"+s1==s4);
		//System.out.println("s1==s3"+s1==s3);
		
		String s5="Ram";
		String s6="Ram";
		
		System.out.println("  s5==s6  is "+(s5==s6)); //false
		System.out.println(s5==s6);//true
		
	}

	

}
