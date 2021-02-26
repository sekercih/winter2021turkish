package day12;

import java.util.Scanner;

public class C3_Lenght {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen string giriniz");
		String str=scan.next().toUpperCase();
		char sonHarf=str.charAt(str.length()-1);
System.out.println(sonHarf);
	}

}
