package day10;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir g�n giriniz");
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta i�i");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("l�tfen ge�erli g�n giriniz");
		}
		

	}

}
