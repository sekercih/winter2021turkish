package day07;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1. kenarý girin");
		double kenar1=scan.nextDouble();
		System.out.println("2. kenarý girin");
		double kenar2=scan.nextDouble();
	if (kenar1==kenar2) {
		System.out.println("karedir");
	} else {
		System.out.println("dikdörtgen");
		
		scan.close();

	}

	}

}
