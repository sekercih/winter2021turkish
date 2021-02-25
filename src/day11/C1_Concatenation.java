package day11;

public class C1_Concatenation {

	public static void main(String[] args) {
		System.out.println(15+20+"Merhaba");
		
		String str1="Hello";
		String str2="Word";
		
		System.out.println(str1.concat(" "+str2));
		System.out.println(str1.concat(" ").concat(str2));
	}

}
