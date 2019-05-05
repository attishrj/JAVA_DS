package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String userInput=reader.readLine();
		System.out.println("Enter the rotation degree");
		int rotationDegree=Integer.parseInt(reader.readLine());
		String encrypted=encrpt(userInput,rotationDegree);
		System.out.println("Result is "+encrypted);

	}

	private static String encrpt(String userInput,int rotateBy) {
		StringBuilder builder=new StringBuilder(userInput);
		StringBuilder builder2=new StringBuilder();
		char charAt;
		for(int i=0;i<userInput.length();i++)
		{
			//char charAt = builder.charAt(i);
			charAt=builder.charAt(i);
			charAt+=rotateBy;
			builder2.append(charAt);
		}
		return builder2.toString();
	}

}
