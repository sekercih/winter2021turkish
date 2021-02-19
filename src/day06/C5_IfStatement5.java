package day06;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if(kenar1==kenar2) {
			System.out.println("kare");
		}if(kenar1!=kenar2) {
			System.out.println("dikdörtgen");
		}

	}

}
