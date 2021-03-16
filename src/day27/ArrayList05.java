package day27;

import java.util.*;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		// Verilen bir Arrayi Liste nasıl çvirebiliriz.
		
		Integer []sayi= {10,12,35,60,40};
		List<Integer> list= Arrays.asList(sayi);
		System.out.println(list);
	}

}
