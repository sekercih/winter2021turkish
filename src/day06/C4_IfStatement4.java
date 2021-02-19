package day06;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kullanici lütfen gün giriniz");
		String gunIsmi = scan.next().toLowerCase();
		if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
			System.out.println("hafta sonu");

		}
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("çarþamba")
				|| gunIsmi.equals("perþembe") || gunIsmi.equals("cuma")) {
			System.out.println("hafta içi");
		} else {
			System.out.println("lütfen geçerli bir gün girin");
		}
		scan.close();
	}

}
