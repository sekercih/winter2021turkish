package day07;

import java.util.Scanner;

public class C5_ifElse4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen 1kenarý giriniz");

		int kenar1 = scan.nextInt();

		System.out.println("Lütfen 2.kenarý giriniz");

		int kenar2 = scan.nextInt();
		if (kenar1 > 0 && kenar2 > 0) {

			if (kenar1 == kenar2) {
				System.out.println("Eþkenar üçgen");
			} else {
				System.out.println("Eþkenar deðil");

			}
		} else {
			System.out.println("Lütfen 0 dan büyük sayi giriniz.");
		}
	}

}
