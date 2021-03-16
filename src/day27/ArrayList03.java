package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		
	//Kullanýcýdan bir sayý alýn sayýdan küçük olan fibonacci dizisini oluþturun
		
				//1 1 2 3 5 8 13 21 34
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Bir sayý giriniz");
				int sayi=6;
				
			List<Integer> fibo=new ArrayList<>();
			fibo.add(1);
			fibo.add(1);
			
			for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {
				fibo.add(fibo.get(i-2)+fibo.get(i-1));
			}System.out.println(fibo);
			
			
			
			
			

	}
}
