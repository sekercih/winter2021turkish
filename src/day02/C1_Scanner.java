package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("karaenin etrafýný hesaplamak için tek kenar uzunluðu girin");
		
		double karekenar=scan.nextDouble();
		
		System.out.println(karekenar*karekenar);
		
		
		
		scan.close();

	}

}
