package day10;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir gün giriniz");
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta içi");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("lütfen geçerli gün giriniz");
		}
		

	}

}
