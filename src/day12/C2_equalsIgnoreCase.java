package day12;

public class C2_equalsIgnoreCase {

	public static void main(String[] args) {
		String str ="Ali Can";
		String str1="ali cAn";
		
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));

	}

}
