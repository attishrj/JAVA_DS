package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseString {
	
	public static String reverse(String input){
		String []init=input.split(" ");
		String consolidate="";
		for (int i =  init.length-1; i >=0; i--) {
			consolidate+=init[i]+" ";
		}
		return consolidate;
	}

	public static void main(String[] args) throws IOException{
      BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the number of input");
      int n=Integer.parseInt(reader.readLine());
    String[] ip=new String[n];
    for(int i=0;i<n;i++)
    {
    	System.out.println("Enter the input "+i+1);
    	ip[i]=reader.readLine();
    }
    
    
    for(int i=0;i<n;i++){
    	
    	System.out.println("The reverse "+reverse(ip[i]));
    	
    }
  
    

	}
	
	

}
