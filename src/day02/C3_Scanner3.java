package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("l�tfen isim giriniz");
		 String isim=scan.nextLine();
		 System.out.println("l�tfen soyisim giriniz");
		 String soyIsim =scan.nextLine();
		 
		 String tamAd=isim+" "+soyIsim;
		 
		 System.out.println(tamAd);
		 

	}

}
