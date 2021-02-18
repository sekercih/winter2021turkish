package day04;

import java.util.Scanner;

public class C3_Modules2 {

	public static void main(String[] args) {
		/*Kullanicidan 4 basamakli bir sayi alalim ve sayinin basamaklarini
		 * ters sirada yazdiralim.
	
	
	
	bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz.
	
	1. islem en sonda ki basamagi elde etmek 
	2. islem en sonda ki basamagi yok etmek
	
	
	
	
	
	
		*/
		
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Basamaklarini bulmak icin 4 basamakli bir sayi giriniz");
		
		int sayi= scan.nextInt(); // bu satirdan itibaren elimizde 4 basamakli bir sayi var.
		
		
		// 4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz
		// 1. tekrar
		
		int birlerBas= sayi %10;
		
		sayi/=10;
		
		// bu satirdan itibarek sayimiz 3 basamakli oldu
		// onlar basamagini bulmak icin 2. islem tekrari
		
		int onlarBas= sayi % 10;
		
		sayi/=10;
		
		// bu satirdan itibaren sayimiz 2 basamakli
		
		// 3. islem Tekrari
		
		int yuzlerBas=sayi%10;
		
		sayi/=10;
		
// bu satirdan itibaren sayimiz 1 basamakli


		
		int binlerBas=sayi; // burda % islemi yapmak zorunda degiliz.
		
		
		System.out.println("birler basamagi :" + birlerBas);
		System.out.println("Onlar Basamagi :" + onlarBas);
		System.out.println("Yuzler basamagi:" + yuzlerBas);
		System.out.println("Binler basamagi:" +binlerBas);
		
		
		// sayiyi tersten yazdiralim
		
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		System.out.print(binlerBas);
		
		System.out.println(); // 75 ve 81.satirlari yan yana yazmamasi icin println uzantisina ihtiyacimiz var.
		// diger bir secenek ise direkt 75. satiri println olarak yazabilirim yazarsam da 77. satirdaki koda ihtiyacimiz kalmaz..
		
		// sayinin rakamlari toplamini bulalim 
		System.out.println(birlerBas + onlarBas + yuzlerBas + binlerBas);
		
		// rakamlari toplamini degil yanyana yazdirmak istersek 
		System.out.println("Yazdiginiz sayinin tersten yazilisi: "+ birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		
		
		 
		 
		 
		 scan.close();
		 
		 
		 

	}

}
