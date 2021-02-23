package day09;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 1 sayi giriniz");
		
		int num=scan.nextInt();
		 String sonuc=num%2==0?"cift":"tek";
		 System.out.println(sonuc);
		 
		 int mutlak=num>0? num:(num*(-1));
		 System.out.println("mutlak deðer= "+mutlak);
		 
		 

	}

}
