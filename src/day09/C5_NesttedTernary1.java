package day09;

import java.util.Scanner;

public class C5_NesttedTernary1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 2 sayi giriniz");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		String result=(kenar1>0 &&kenar2>0)?(kenar1==kenar2 ?"kare":"kare de�il"):("ge�ersiz rakam");
		System.out.println(result);
		String sonuc=kenar1==kenar2 ?"kare":"kare de�il";
		//System.out.println(sonuc);
//

	}

}
