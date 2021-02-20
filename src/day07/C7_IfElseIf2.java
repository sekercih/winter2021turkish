package day07;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise
		// sayilarin toplamini yazdirin,
		// sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi
		// farkli isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin�
		// yazdirin,
		// sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir�
		// yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 1. say�y� giriniz");
		int num1 = scan.nextInt();
		System.out.println("l�tfen 2. say�y� giriniz");
		int num2 = scan.nextInt();

		if (num1 > 0 && num2 > 0) {
			System.out.println("Pzitif Toplama yap="+(num1 + num2));

		} else if (num1 < 0 && num2 < 0) {
			System.out.println("Negatif �arpma Yap ="+num1 * num2);
			
		} else if ((num1 < 0 || num1 > 0) && (num2 < 0 || num2 > 0)) {
			System.out.println("Farkl� i�aretli i�lem yap�lmaz");
			
		} else if (num1 == 0 || num2 == 0) {
			System.out.println("S�f�r �arpmaya g�re yutan elemand�r.");
		}
	}

}
