package day07;

import java.util.Scanner;

public class C3_ifElse2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bi harf giriniz");

		char harfGirin = scan.next().toUpperCase().charAt(0);

		if (harfGirin >= 'A' && harfGirin <= 'Z') {
			System.out.println("harftir");
		} else {
			System.out.println("harf de�ildir");
		}
System.out.println("Girilen Karakter = "+harfGirin);
	}

}
