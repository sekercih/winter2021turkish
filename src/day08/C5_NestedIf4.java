package day08;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		/*
		 * Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		 * Kullanicidan bir sifre girmesini isteyin Eger ilk harf buyuk harf ise �A�
		 * olup olmadigini kontrol edin. Ilk harf A ise �Gecerli Sifre� degilse
		 * �Gecersiz Sifre� yazdirin. Eger ilk harf kucuk harf ise �z� olup olmadigini
		 * kontrol edin. Ilk harf z ise �Gecerli Sifre� degilse �Gecersiz Sifre�
		 * yazdirin.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("l�tfen bir sifre giriniz");
		char sifre = scan.next().charAt(0);

		if (sifre >= 'A' && sifre <= 'Z') {
			if (sifre == 'A') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Sifre ge�ersiz");
			}
		} else if (sifre >= 'a' && sifre <= 'z') {
			if (sifre == 'z') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Ge�ersiz �ifre");
			}
		} else {
			System.out.println("ge�ersiz �ifre");
		}

	}

}
