package day10;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen bir ay i�in say� girin giriniz");
		int ay=scan.nextInt();
		
	    switch (ay) {
		case 1:
			System.out.println("ocak");
			break;
		case 2:
			System.out.println("�ubat");
			break;
		case 3:
			System.out.println("mart");
			break;
		case 4:
			System.out.println("nisan");
			break;
		case 5:
			System.out.println("may�s");
			break;
		case 6:
			System.out.println("haziran");
			break;
		case 7:
			System.out.println("temmuz");
			break;
		case 8:
			System.out.println("agustos");
			break;
		case 9:
			System.out.println("eyl�l");
			break;
		case 10:
			System.out.println("ekim");
			break;
		case 11:
			System.out.println("kasim");
			break;
		case 12:
			System.out.println("aral�k");
			break;

		default:
			System.out.println("l�tfen ge�erli bir ay giriniz");
		}
scan.close();
	}

}
