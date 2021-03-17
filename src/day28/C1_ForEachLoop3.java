package day28;

import java.util.*;

public class C1_ForEachLoop3 {

	public static void main(String[] args) {
		String arr[]= {"Ali","Veli","Ayse","Fatma"};
		List<String> list=listeyiCevir(arr);
		list.add(0,"Kahraman");
		System.out.println(list);

	}

	public static List<String> listeyiCevir(String[] arr) {
		List<String> geciciList=new ArrayList<>();
		for (String string : arr) {
			geciciList.add(string);
		}
		return geciciList;
	}

}
