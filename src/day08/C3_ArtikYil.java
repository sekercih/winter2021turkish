package day08;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir y�l giriniz");
		int artikYil=scan.nextInt();
		
		if(artikYil%4==0 && artikYil%100!=0) {
			System.out.println("Artik yildir.");
			
			}else if(artikYil%100==0 &artikYil%400==0) {
				System.out.println("art�k yil .");
			}else {
				System.out.println("Artik y�l de�ildir.");
			}
		}
		
		

	}


