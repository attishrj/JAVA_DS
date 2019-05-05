package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestEvenSubstring {

	public static void main(String[] args) throws IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	String sentence=reader.readLine();
	System.out.println("The longest even word is \n"+findMaxEvenString(sentence));
	

	}
	public static String findMaxEvenString(String sentence)
	{
		String[] str=sentence.split("\\s+");
		String[] resStr=new String[str.length];
		String res="";
		int j=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()%2==0)
			{
				resStr[j++]=str[i];
				       
			}
		}
		for(int i=0;i<resStr.length-1;i++)
		{
			if(null!=resStr[i])
			{
			if(resStr[i].length()<resStr[i+1].length())
			{
				String temp=resStr[i];
				resStr[i]=resStr[i+1];
				resStr[i]=temp;
				res=resStr[i+1];
			}
		}
		}
		
		return res;
	}

}
