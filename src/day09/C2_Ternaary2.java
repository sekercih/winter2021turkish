package day09;

import java.util.Scanner;

public class C2_Ternaary2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 2 sayi giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int result=a>b? a:b;
		
		System.out.println(result);
		scan.close();

	}

}
