package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringUtility {
	
	public static void separate(String str){
		String word="";
		
		for(int i=0;i<str.length();i++)
		{
			char charAt = str.charAt(i);
			if (charAt!=' ') {
				word=word+charAt;
			}
			else{  
				print(word);
				word="";
			}
		}
	}
	
	public static int possiblePallind(String str)
	{
		String word="";
		int counter=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
			char charAT=str.charAt(j);
			if(charAT!=' ')
			{
				word+=charAT;
				if (checkPalin(word)) {
					counter++;
				}
			}
			
			}
			word="";
		}
		return counter;
	}

	private static boolean checkPalin(String word) {
		StringBuilder builder=new StringBuilder(word);
		StringBuilder reverse=builder.reverse();
		 if(word.equals(reverse.toString()))
		{
		   System.out.println(" "+word);		
		   return true;
		}
		return false;
	}

	private static void print(String word) {
		System.out.println("The string is  -----"+word);
		
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Enter the string");
	    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine();
		String[] str= input.split("");
		String[] stringFormed = input.split("\\s+");
		String[] stringFor= input.split(" ");
		input=input.replace("\\s+", "");
		int a=stringFormed.length;
		System.out.println(a);
		//separate(input);
		//System.out.println("The possible no of pallindrome of "+input+" is "+possiblePallind(input));
		
		

	}

}
