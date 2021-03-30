package day39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {
	public static void main(String[] args) {
		 /*
        Eger handle edilecek exception'lar arasinda parent-child iliskisi varsa
        bu durmda child exception icin catch blogu yazmasak da kodumuz calisir
        Child exception'i silmenin 
        pozitif yani : tek catch blogu ile tum exceptionlar handle edilebilir
        negatif yonu : bir sorunla karsilastigimizda bunun dosya bulunamadigi icin mi
                        yoksa dosyaokunamadigi icin mi oldugu anlasilamaz
     */
		String str = "src\\day39\\File";
		try {
			FileInputStream fis = new FileInputStream(str);
			int k = 0;

			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
