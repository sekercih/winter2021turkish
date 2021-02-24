package day10;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen kýsaltmayý yazdýrýn");
		char harf=scan.next().charAt(0);
		
		switch (harf) {
		case 'v':
		case 'V':
			System.out.println("Very");
			break;
		case 'I':
		case 'i':
			System.out.println("Important");
			break;
		case 'P':
		case 'p':
			System.out.println("Person");
			break;

		default:
			System.out.println("geçersiz harf");
			
		}

	}

}
