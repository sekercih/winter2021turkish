package day07;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen yaþýnýzý giriniz");
		
		int yas=scan.nextInt();
		
		if (yas==65) {
			System.out.println("Emekli Olabilirsiniz");
		} else if(yas>66){
		System.out.println(" yasamaman lazým");
		}else {
			System.out.println("Çalýþmaya devam et,emekliliði unut");

		}

	}

}
