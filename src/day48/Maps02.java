package day48;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
       
        
        map1.put(101, "Ali, Can, Java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "bAli, Yan, java");
        map1.put(104, "zambak, Yan, C#");
        map1.put(105, "HAli, Yan, JAVA");
        String istenenDil="java";
        List<String> isimList=javaBilenler(map1,istenenDil);
        System.out.println(isimList);

	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		System.out.println(map1.values());
		System.out.println(map1.keySet());
		List<String>isimListesi=new ArrayList<>();
		
		for(String each:map1.values()) {
			String arr[]=each.split(", ");
			if (arr[2].equalsIgnoreCase("java")) {
				isimListesi.add(arr[0]);
			}
		}
		
				return isimListesi;
	}

}
