package day10;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen bir rakam giriniz");
		int rakam = scan.nextInt();

		if (rakam == 1) {
			System.out.println("bir");

		} else if (rakam == 2) {
			System.out.println("iki");
		} else if (rakam == 3) {
			System.out.println("��");

		} else if (rakam == 4) {
			System.out.println("d�rt");

		} else if (rakam == 5) {
			System.out.println("be�");

		} else if (rakam == 6) {
			System.out.println("alt�");

		} else if (rakam == 7) {
			System.out.println("yedi");
		} else if (rakam == 8) {
			System.out.println("sekiz");

		} else if (rakam == 9) {
			System.out.println("dokuz");

		} else {
			System.out.println("L�tfen ge�erli rakam giriniz= " + rakam);

		}

		switch (rakam) {
		case 0:
			System.out.println("s�f�r");
			break;
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("d�rt");
			break;
		case 5:
			System.out.println("be�");
			break;
		case 6:
			System.out.println("alt�");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8: // rakam==8 gibi cal���r
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;
		default:
			System.out.println("l�tfen rakam giriniz");

		}
		
		//5321 say�s�n� yaz�yla yazd�r�n�z.

	}

}
