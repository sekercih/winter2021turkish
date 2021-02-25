package day11;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		String str="Zonguldaki";
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(str.toUpperCase(Locale.CANADA_FRENCH));
		
		

	}

}
