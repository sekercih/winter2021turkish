package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("karaenin etraf�n� hesaplamak i�in tek kenar uzunlu�u girin");
		
		double karekenar=scan.nextDouble();
		
		System.out.println(karekenar*karekenar);
		
		
		
		scan.close();

	}

}
