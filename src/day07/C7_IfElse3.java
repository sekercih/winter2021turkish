package day07;

import java.util.Scanner;

public class C7_IfElse3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen istedi�iniz maa�� giriniz");
		
		int maas=scan.nextInt();
		
		if (maas>80000) {
			System.out.println("Kabul ediyorum");
		}if (maas>60000 &&maas<80000) {
			System.out.println("Konusabiliriz");
		} else if (maas<60000) {
			System.out.println("�al��amay�z");
		}

		}

	}


