package day07;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen ya��n�z� giriniz");
		
		int yas=scan.nextInt();
		
		if (yas==65) {
			System.out.println("Emekli Olabilirsiniz");
		} else if(yas>66){
		System.out.println(" yasamaman laz�m");
		}else {
			System.out.println("�al��maya devam et,emeklili�i unut");

		}

	}

}
