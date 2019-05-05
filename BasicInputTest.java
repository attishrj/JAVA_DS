package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicInputTest {

	public static void main(String[] args) throws IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Begin");
	String test=reader.readLine();
	System.out.println(test);
	System.out.println("Begin2");
	int ip=Integer.parseInt(reader.readLine());
	System.out.println(ip);
	System.out.println("Begin3");
	String ipAr=reader.readLine();
	System.out.println(""+ipAr);
	String[] split = ipAr.split("\\s+");
	int []convert=new int[ip];
	for (int i = 0; i < split.length; i++) {
		convert[i]=Integer.parseInt(split[i]);
		
	}
	
	
	
	

	}

}
