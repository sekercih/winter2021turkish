package day08;

import java.util.Scanner;

public class C4_ArtikYilNested�f {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen bir y�l giriniz");
		int artikYil = scan.nextInt();
		if (artikYil % 100 == 0) {
			if (artikYil % 400 == 0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("artik yil de�il");
			}
		} else {
			if (artikYil % 4 == 0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil de�ildir");
			}
		}
	}

}
