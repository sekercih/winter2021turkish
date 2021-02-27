package day13;

public class C3_StartsWithIsEmpty {

	public static void main(String[] args) {
		String str="Hergun Java Olsa.";
		
		System.out.println(str.startsWith("H"));
		System.out.println(str.startsWith("u",4));//true
		
		String str3=null;
		String str1="";
		
		System.out.println(str1.isEmpty());//true
		
		System.out.println(str3.isEmpty()); //Nullpointerexception
		
		
		

	}

}
