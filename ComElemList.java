package com.ques.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ComElemList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		List<Integer> l3=new ArrayList<>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l2.add(1);
		l2.add(3);
		l2.add(5);
		l3.add(2);
		l3.add(4);
		l3.add(6);
		l3.add(3);
		
		
		Set<Integer> s1=new HashSet<Integer>(l1);
		Set<Integer> s2=new HashSet<Integer>(l2);
		s1.retainAll(s2);
		Set<Integer> s3=new HashSet<>(l3);
		Set<Integer> res=new HashSet<>();
		res.addAll(s1);
		res.addAll(s2);
		res.addAll(s3);
		//s1.retainAll(s3);
		System.out.println(s3);

	}

}
