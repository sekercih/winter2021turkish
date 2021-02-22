package day08;

public class C2_NestedIf {

	public static void main(String[] args) {
		/*Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
		 yazdiran bir java programi yaziniz
		 Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		 calisan erkekse 65 yasindan buyukse emekli olabilir.
		 */
		String cinsiyet="Erkek";
		int yas=66;
		
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		}
		
		else if(cinsiyet.equalsIgnoreCase("erkek")&&yas>65) {
			System.out.println("Emekli olabilir");
		}else if(cinsiyet.equalsIgnoreCase("erkek")&&yas<65) {
			System.out.println("Emekli olamazsin");
		}else if (cinsiyet.equalsIgnoreCase("kadin")&&yas>65) {
			System.out.println("Emekli olabilir"); 
			
		}else if (cinsiyet.equalsIgnoreCase("kadin")&&yas>65) {
			System.out.println("Emekli olabilir"); 
			
		}else {
			System.out.println("Cinsiyet ve yas tanımsız");
		}
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			if (yas<0) {
				System.out.println("yas negatif olamaz");
			}else if (yas>65) {
				System.out.println("emekli olabilirsin");
			}else if (yas<65) {
				System.out.println("emekli olamazsın");
			}
			
		} else if(cinsiyet.equalsIgnoreCase("kadin")){
			if (yas<0) {
				System.out.println("yas negatif olamaz");
			}else if (yas>65) {
				System.out.println("emekli olabilirsin");
			}else if (yas<65) {
				System.out.println("emekli olamazsın");
			}
			
		}else {
			System.out.println("gecerli cinsiyet giriniz");
		}
		

	}}


