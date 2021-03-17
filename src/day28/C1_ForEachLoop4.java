package day28;

import java.util.*;

public class C1_ForEachLoop4 {

	public static void main(String[] args) {
		// iki String array olusturunuz ve bu array’lerdeki ortak elemanlari 
        // For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        // Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

		
		String []arr1= {"Ali","Can","Seher","Ayse","Pelin","er"};
		String [] arr2= {"Ali","Veli","Mehmet","Seher","as","sa","er"};
		
		List<String>ortakList=new ArrayList<>();
		for (String string1 : arr1) {
			for (String string2 : arr2) {
				if (string1.equals(string2)) {
					ortakList.add(string1);
				}
			}
		}
		if (ortakList.isEmpty()) {
			System.out.println("ortak eleman yoktur");
		} else {
			System.out.println(ortakList);
		}
		

	}

}
