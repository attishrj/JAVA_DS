package com.ques.hackerrank;


	
	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Solution {
		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);

	        /* Declare second integer, double, and String variables. */
	        int sumi=0;
	        double sumd=0.0;
	        String toConcat;
	         sumi=16-i;
	         sumd=8.0-d;
	         int res=(sumi)+(i);
	         double result=(sumd)+(d);
	         toConcat=" is the best place to learn and practice coding!";

	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

	        /* Print the sum of both integer variables on a new line. */
	        System.out.println(sumi);
	         System.out.println(sumd);
	          System.out.println(s.concat(toConcat));
	          System.out.println(s+toConcat);

	        /* Print the sum of the double variables on a new line. */
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */

	        scan.close();
	    }
	}


