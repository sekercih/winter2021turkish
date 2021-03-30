package day39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
	/*
	 * Eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum
	 * olusuyorsa Icice try-catch bloklari olusturabiliriz Bu ornekte ilk once
	 * dosyayi okutmak istedik Java "Ya dosyayi bulamazsam? " diye bizden yardim
	 * istedi Biz de try-catch blogu ile FIleNOtFoundException ile handle etmesinde
	 * yardimci olduk Sonra dosyadaki yazilari okumaya calistik ve Java yeniden
	 * "Ya dosyayi okuyamazsam " diye yardim istedi Biz de try-catch blogu ile
	 * IOException ile handle etmesini sagladik.
	 * 
	 */

	public static void main(String[] args) {
		String str = "C:\\Users\\apple\\eclipse-workspace\\winter2021turkish\\src\\day39\\File";
		try {
			FileInputStream fis = new FileInputStream(str);
			int k = 0;
			try {
				while ((k = fis.read()) != -1) {
					System.out.print((char) k);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}

	}

}
