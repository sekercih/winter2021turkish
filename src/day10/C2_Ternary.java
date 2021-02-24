package day10;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("çift");
		} else {
  System.out.println(sayi*sayi);
		}
	}

}
