package day28;

import java.util.*;

public class C1_ForEachLoop5 {
	 // Bir integer list olusturunuz ve 
    // bu list�deki tum sayilarin karesinin toplamini 
    // For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.


	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		System.out.println(list);
	int count=0;
		for (Integer kare : list) {
			count=kare*kare+count;
			
		}System.out.println(count);
		

	}

}
