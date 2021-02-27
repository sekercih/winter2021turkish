package day13;

import java.util.Scanner;

public class C7_Examples {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 4 harfli bir kelime giriniz");
		String str=scan.nextLine();
		
		if (str.length()!=4) {
			System.out.println("lütfen 4 karakterli bir kelme giriniz");
		} else {
System.out.print(str.substring(3));
System.out.print(str.substring(2,3));
System.out.print(str.substring(1,2));
System.out.print(str.substring(0,1));
		}

	}

}
