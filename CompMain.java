package com.java.collection;

import java.util.TreeSet;

public class CompMain {

	public static void main(String[] args) {
	TreeSet<Integer> tset=new TreeSet<>(new CompIml());
	//TreeSet<Integer> tset=new TreeSet<>();
	tset.add(1);
	tset.add(11);
	tset.add(21);
	tset.add(21);
	tset.add(21);
	System.out.println(tset);

	}

}
