package day44;

import java.util.*;

public class Iterator02 {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<>();
	        
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");
	        
	        System.out.println(list); // [A, B, C, D]
	        
		ListIterator lite=list.listIterator();
		
		while (lite.hasNext()) {
			
			String temp=(String) lite.next();
			lite.set(temp+"B");
			
			
		}
		System.out.println(list);
	}

}
