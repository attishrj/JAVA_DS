package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinDelAnagram {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the string");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		System.out.println("Enter the second string");
		String str2 = reader.readLine();
		System.out.println(remAnagram(str1, str2));;
		
	}
	
	 // function to calculate minimum numbers 
    // of characters to be removed to make 
    // two strings anagram 
    static int remAnagram(String str1, String str2) 
    { 
        // make hash array for both string  
        // and calculate frequency of each 
        // character 
        int count1[] = new int[26];  
        int count2[] = new int[26]; 
  
        // count frequency of each charcter  
        // in first string 
        for (int i = 0; i < str1.length() ; i++) {
			char charAt1 = str1.charAt(i);
			count1[charAt1 ]++;
		} 
      
        // count frequency of each charcter  
        // in second string 
        for (int i = 0; i < str2.length() ; i++) {
			char charAt2 = str2.charAt(i);
			str2.toCharArray();
			count2[charAt2 -'a']++;
		} 
  
        // traverse count arrays to find  
        // number of charcters to be removed 
        int result = 0; 
        for (int i = 0; i < 26; i++) 
            result +=(count1[i] - 
                               count2[i]); 
        return result; 
    } 

}
