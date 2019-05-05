package com.ques.hackerrank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pallindrome {
	/*

	private  void checkPalindrome(String next,int n) {
	///	next.replace(oldChar, newChar)("\t");
		
		
		String[] stringArray=next.split(" ") ; 
		
		System.out.println("Number of Pallindrome.checkPalindrome()"+check(stringArray,n));
	}
	
	private int check(String[] stringArray, int n) {
		int start=0;
		int counter = 0;
		for(String temp:stringArray)
		{
			//int end=n-1;
			//StringBuilder builder=new StringBuilder(temp);
			if (temp.length()>=n) {
			//	return -1;
			
			
			StringBuilder substring =new StringBuilder( temp.substring(start, n));
			if (substring.toString().equals(substring.reverse().toString())) {
				
				counter++;
			}
			
			start++;
			
		}
		}
		return counter;
	}

	public static void main(String[] args) throws IOException {
 BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the string");
   Pallindrome obj=new Pallindrome();
   obj.checkPalindrome(reader.readLine(),3);
   reader.close();
	}


*/
	
	 public static boolean checkPalindrome(String str) {
		/* StringBuilder builder=new StringBuilder(str);
		 StringBuilder reverse = builder.reverse();
		 if (builder.toString().equals(reverse.toString())) {
			 return true;
		}
		return false;*/
		 
	           for(int i=0;i<=str.length()/2;i++) {
				char charAtbegin = str.charAt(i);
				char charAtend = str.charAt(str.length()-1-i);
				if(charAtbegin!=charAtend)
	                return false;
			}
	        return true;
	    }
	 
	 public static void printAllPalindrome(String str,Set<String> set) {
		 //Set<String> set=new HashSet<>();
	        for(int i=0;i<=str.length();i++)
	            for(int j=i;j<str.length();j++) {
					String substring = str.substring(i,j+1);
					if(checkPalindrome(substring))
	                  //  System.out.println(str.substring(i,j+1));
	                	set.add(str.substring(i,j+1));
				}
	    }

	 static int counter;
	 public static void main(String[] args) {
		 Set<String> set=new HashSet<>();
	      printAllPalindrome("I WORK in CTC LOVE JAVA",set);
	      printSet(set);
	        
	    }

	private static void printSet(Set<String> set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string =  iterator.next();
			System.out.println(string);
		  counter++;	
		}
		System.out.println("total possible pallindrome "+counter);
	}
	
	



}
