package day46;

import java.util.*;

public class C4_LinkHashSet01 {

	 public static void main(String[] args) {
	        //
	        
	        Set<String> set1 = new LinkedHashSet<>();
	        
	        set1.add("D");
	        set1.add("B");
	        set1.add("A");
	        set1.add("F");
	        set1.add("D");
	        System.out.println(set1); // [D, B, A, F]
	        
	        System.out.println(System.currentTimeMillis());
	        for (int i = 0; i < 10000; i++) {
	            set1.add(""+i);
	        }
	        
	        System.out.println(System.currentTimeMillis());
	        
	        System.out.println("=================");
	        
	        Set<String> set2 = new HashSet<>();
	        System.out.println(System.currentTimeMillis());
	        for (int i = 0; i < 10000; i++) {
	            set2.add(""+i);
	        }
	        
	        System.out.println(System.currentTimeMillis());
	        
	        
	    }
	}
