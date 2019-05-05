package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingCharacters {

	static String getalternatingCharacters(String str) {
			StringBuilder strBuilder=new StringBuilder(str);
			int i=0;
			while (i<strBuilder.length()-1) {
				if(strBuilder.charAt(i)+1==strBuilder.charAt(i+1))
				{
					strBuilder.deleteCharAt(i+1);
				}
				else{
				i++;
				}
			}
			
			 
		
  return strBuilder.toString();

    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int n;
    	System.out.println("Enter the no of input");
    	   n = Integer.parseInt(br.readLine());
    	
    	String[] input=new String[n];
    	for (int i = 0; i <n; i++) {
    		System.out.println("Enter the element");
    		input[i]= br.readLine();
		}
    	
    	for (int i = 0; i < n; i++) {
    		//System.out.println(getalternatingCharacters(input[i]));
    		System.out.println("The modified string is "+getalternatingCharacters(input[i]));
		}
    	
      
    }

}
