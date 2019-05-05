package com.java.collection;

import java.util.Comparator;

public class CompIml implements Comparator<Integer> {

	/*@Override
	public int compare(Integer o1, Integer o2) {

		if (o2 > o1) {
			return 1;
		} else {
			return -1;
		}

	}
	*/
	@Override
	public int compare(Integer o1, Integer o2) {

		//return o2.compareTo(o1);
		//return -o2.compareTo(o1);
	//	return 2;
		return -1;

	}
	

}
