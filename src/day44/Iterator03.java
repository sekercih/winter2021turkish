package day44;

import java.util.*;

public class Iterator03 {

	public static void main(String[] args) {
		/*Bir listedeki istenen sayi araliginda olmayan 
		 * elementleri silen bir program yaziniz … 
		 * (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
		 Orn : [2,13,56,23,45,14,40] istenen aralik 
		 20 ile 40 arasi (sinirlar dahil)
		 output: [23,40]*/
		
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(56);
		list.add(23);
		list.add(45);
		list.add(14);
		list.add(40);
		ListIterator lite=list.listIterator();
		
		while (lite.hasNext()) {
			int temp=(int) lite.next();
			if (temp<20||temp>40) {
				lite.remove();
			}
		}
		System.out.println(list);
		
	}

}
