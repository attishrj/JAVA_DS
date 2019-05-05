package com.ques.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(52);
		list.add(62);
		list.add(72);
		list.add(82);
		list.add(92);
		System.out.println("Before Rotation "+list);
		Collections.rotate(list, 5);
		System.out.println("-----");
		System.out.println("After Rotation "+list);
	}

}
