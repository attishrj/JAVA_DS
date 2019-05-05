package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CheckPallindromePresent {

	public static final int NO_OF_CHARS = 26;
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the string");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		System.out.println("Answer is "+canFormPalindrome(str1));


	}
	/* function to check whether characters  
    of a string can form a palindrome */
    static boolean canFormPalindrome(String str) { 
      
    // Create a count array and initialize all 
    // values as 0 
    int count[] = new int[NO_OF_CHARS]; 
    Arrays.fill(count, 0); 
  
    // For each character in input strings, 
    // increment count in the corresponding 
    // count array 
    for (int i = 0; i < str.length(); i++) {
		char charAt = str.charAt(i);
		count[charAt-'a']++;
	} 
  
    // Count odd occurring characters 
    int odd = 0; 
    for (int i = 0; i < NO_OF_CHARS; i++)  
    { 
    if ((count[i] %2 ) != 0) 
        odd++; 
  
    if (odd > 1) 
        return false; 
    } 
  
    // Return true if odd count is 0 or 1, 
    return true; 
} 

}
