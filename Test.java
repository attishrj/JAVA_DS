package com.ques.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("rama");
		list.add("doce");
		list.add("ram");
		list.add("oced");
		list.add("code");

		perform(list);

	}
	
	public static void perform(List<String>llist)
	{
		for (int i = 0; i < llist.size() - 1; i++) {
			String temp = llist.get(i);
			for (int j = i + 1; j < llist.size(); j++) {
				String temp2 = llist.get(j);
				char[] c1 = temp.toCharArray();
				char[] c2 = temp2.toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				if (Arrays.equals(c1, c2)) {
					llist.remove(temp2);
					j=j-1;

				}
			}
		}
		System.out.println("Test.perform()"+llist);
	}

}
