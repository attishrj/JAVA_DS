package com.ques.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MagicalAnagram {
	List<String> list;
	public MagicalAnagram(List<String> listIp) {
		this.list=listIp;
	}
	public List<String>  magAanagram(List<String> lists){
	 String temp2;
		String temp;
		
		for(int i=0;i<lists.size();i++)
		{
			temp=list.get(i);
			for(int j=i+1;j<list.size();j++)
			{
				temp2=list.get(j);
				
				char[] c1=temp.toCharArray();
				char[] c2=temp2.toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				if(	Arrays.equals(c1, c2))
				{
					list.remove(temp2);
					j=j-1;
				}
				
			}
				
		}
		Collections.sort(list);
		return lists;
		
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("code");
		list.add("doce");
		list.add("oced");
		list.add("ram");
		list.add("rama");
		MagicalAnagram obj=new MagicalAnagram(list);
	Iterator<String>itr=	obj.magAanagram(list).iterator();
	while (itr.hasNext()) {
	System.out.println( itr.next());
		
	}
	}

}
