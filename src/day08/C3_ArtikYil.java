package day08;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir yýl giriniz");
		int artikYil=scan.nextInt();
		
		if(artikYil%4==0 && artikYil%100!=0) {
			System.out.println("Artik yildir.");
			
			}else if(artikYil%100==0 &artikYil%400==0) {
				System.out.println("artýk yil .");
			}else {
				System.out.println("Artik yýl deðildir.");
			}
		}
		
		

	}


