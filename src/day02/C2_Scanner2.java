package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen dairenin yarý çapýný giriniz");
		
	double dairecap=scan.nextDouble();
	double alan=dairecap*dairecap*3.14;
	System.out.println(alan);
	
	scan.close();
		

	}

}
