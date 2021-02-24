package day10;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir rakam giriniz");
		int rakam = scan.nextInt();

		if (rakam == 1) {
			System.out.println("bir");

		} else if (rakam == 2) {
			System.out.println("iki");
		} else if (rakam == 3) {
			System.out.println("üç");

		} else if (rakam == 4) {
			System.out.println("dört");

		} else if (rakam == 5) {
			System.out.println("beþ");

		} else if (rakam == 6) {
			System.out.println("altý");

		} else if (rakam == 7) {
			System.out.println("yedi");
		} else if (rakam == 8) {
			System.out.println("sekiz");

		} else if (rakam == 9) {
			System.out.println("dokuz");

		} else {
			System.out.println("Lütfen geçerli rakam giriniz= " + rakam);

		}

		switch (rakam) {
		case 0:
			System.out.println("sýfýr");
			break;
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("üç");
			break;
		case 4:
			System.out.println("dört");
			break;
		case 5:
			System.out.println("beþ");
			break;
		case 6:
			System.out.println("altý");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8: // rakam==8 gibi calýþýr
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;
		default:
			System.out.println("lütfen rakam giriniz");

		}
		
		//5321 sayýsýný yazýyla yazdýrýnýz.

	}

}
