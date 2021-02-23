package day09;

import java.util.Scanner;

public class C5_NesttedTernary1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 2 sayi giriniz");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		String result=(kenar1>0 &&kenar2>0)?(kenar1==kenar2 ?"kare":"kare değil"):("geçersiz rakam");
		System.out.println(result);
		String sonuc=kenar1==kenar2 ?"kare":"kare değil";
		//System.out.println(sonuc);
//

	}

}
