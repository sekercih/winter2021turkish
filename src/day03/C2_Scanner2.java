package day03;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen isminizi giriniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		
		System.out.println("ba� harfiniz ="+ilkHarf);
		
scan.close();
	}

}
