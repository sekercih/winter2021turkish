package day07;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1. kenar� girin");
		double kenar1=scan.nextDouble();
		System.out.println("2. kenar� girin");
		double kenar2=scan.nextDouble();
	if (kenar1==kenar2) {
		System.out.println("karedir");
	} else {
		System.out.println("dikd�rtgen");
		
		scan.close();

	}

	}

}
