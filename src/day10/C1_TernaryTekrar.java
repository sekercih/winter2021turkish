package day10;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		/*
		Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise 
		�uc basamakli sayi�, yoksa  �Uc  basamakli degil� yazdirin
*/
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen bir tam say� giriniz = ");
		
		int sayi=scan.nextInt();
		
		String sonuc=sayi>99? (sayi<1000?"��basamakl�":"3 basamakl� de�il") :"sayi �� basamakli de�il";
		System.out.println(sonuc);
		
		scan.close();
	}

}
