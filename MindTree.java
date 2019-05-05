package com.ques.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MindTree {
	List<Integer> initialList;
	List<Integer> badList;

	public MindTree(List<Integer> initialList, List<Integer> badList) {
		this.initialList = initialList;
		this.badList = badList;
	}
	
	void removeBadElement(List<Integer> iList,List<Integer> bList){
		
		Iterator<Integer> itr=iList.iterator();
		while (itr.hasNext()) {
			 {
				 
				
			if(bList.contains(itr.next()))
			{
				itr.remove();
				
			}
				
			}
			
		}
		for (Integer integer : iList)
		{
			System.out.println("MindTree.removeBadElement()"+integer);
		}
	}
	

	public static void main(String[] args) {/*
		Scanner in=new Scanner(System.in);
		int size= Utility.intialInput(in);
		List<Integer> initialList=new ArrayList<>();
		System.out.println("Enter the elements in the list");
		for(int i=0;i<size;i++)
		{
			initialList.add(in.nextInt());
		}
		List<Integer> badList=new ArrayList<>();
		badList.add(2);
		badList.add(3);
		MindTree obj=new MindTree(initialList, badList);
		convertListToSet(initialList);
		//obj.removeBadElement(initialList, badList);
		
	*/
		
		 int intArr[] = { 10, 20, 15, 22, 35 }; 
		  
	        // Get the second Array 
	        int intArr1[] = { 10, 15, 22 }; 
	  
	        // To compare both arrays 
	       /* System.out.println("Integer Arrays on comparison: "
	                           + Arrays.compare(intArr, intArr1));
	                           
	*/
	        
	        int[] arr2  =Arrays.copyOf(intArr, intArr.length);
	        System.out.println(" elements ");
	        for (int i = 0; i < arr2.length; i++) {
	        	System.out.print(" "+arr2[i]);
				
			}
	        System.out.print(" "+Arrays.equals(intArr, arr2));
	        
	}

	private static void convertListToSet(List<Integer> initialList2) {
		Set<Integer> set=new HashSet<Integer>();
		for(int x:initialList2)
		{
			set.add(x);
		}
		
		for(int y:set)
		{
			System.out.println("  "+y
					
					
					
					
					
					);
		}
		
	}

}
