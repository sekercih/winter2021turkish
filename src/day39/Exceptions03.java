package day39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {

		String str = "src\\day39\\File";
		try {
			FileInputStream fis = new FileInputStream(str);
			int k = 0;

			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
