package day44;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(56);
		list.add(23);
		list.add(45);
		list.add(14);
		list.add(40);
		ListIterator lite=list.listIterator();
		System.out.println(list);
		while (lite.hasNext()) {
			lite.next();
		}
		while (lite.hasPrevious()) {
			
			System.out.print(lite.previous()+" ");		
			
		}System.out.println(list);
	}

}
