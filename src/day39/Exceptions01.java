package day39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		 // Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
        // Java "Ya dosyayi bulamazsam" der ve bizden cozum uretmemizi bekler
        // dosya bulma ile ilgili exception turu : FileNotFoundException
        // Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir
        // Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Exceptions diyoruz
        //
		String str="C:\\Users\\apple\\eclipse-workspace\\winter2021turkish\\src\\day39\\File";
		try {
			FileInputStream fis=new FileInputStream(str);
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
