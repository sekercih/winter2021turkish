package day06;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kullanici l�tfen g�n giriniz");
		String gunIsmi = scan.next().toLowerCase();
		if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
			System.out.println("hafta sonu");

		}
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("�ar�amba")
				|| gunIsmi.equals("per�embe") || gunIsmi.equals("cuma")) {
			System.out.println("hafta i�i");
		} else {
			System.out.println("l�tfen ge�erli bir g�n girin");
		}
		scan.close();
	}

}
