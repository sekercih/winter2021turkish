package day07;

import java.util.Scanner;

public class C5_ifElse4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen 1kenar� giriniz");

		int kenar1 = scan.nextInt();

		System.out.println("L�tfen 2.kenar� giriniz");

		int kenar2 = scan.nextInt();
		if (kenar1 > 0 && kenar2 > 0) {

			if (kenar1 == kenar2) {
				System.out.println("E�kenar ��gen");
			} else {
				System.out.println("E�kenar de�il");

			}
		} else {
			System.out.println("L�tfen 0 dan b�y�k sayi giriniz.");
		}
	}

}
