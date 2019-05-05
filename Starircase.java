package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Starircase {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input");
		int  n=Integer.parseInt(reader.readLine());
		for(int i =1;i<=n ;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if (i+j>n) {
					
					System.out.print("#");
				}
				else  {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
