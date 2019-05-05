package com.java.basics;

import java.util.ArrayList;
import java.util.List;

public class Immutable {
	public static void main(String[] args) {
		/*String a = "hello";
		a="buff";
		modify(a);
		System.out.println("Immutable.main() a=" + a);

	private static String modify(String a) {
		a = new String();
		return a;
	}*/
		List<String> list=new ArrayList<>();
		list.add("butter");
		list.add("chicken");
		//modifyList(list);
		System.out.println("Immutable.main()"+modifyList(list));

}
	private static List<String> modifyList(List<String> l) {
		l.add("dehati");
		l=new ArrayList<>();
		
	return l;
	}

}