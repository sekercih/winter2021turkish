package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		
	//Kullan�c�dan bir say� al�n say�dan k���k olan fibonacci dizisini olu�turun
		
				//1 1 2 3 5 8 13 21 34
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Bir say� giriniz");
				int sayi=6;
				
			List<Integer> fibo=new ArrayList<>();
			fibo.add(1);
			fibo.add(1);
			
			for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {
				fibo.add(fibo.get(i-2)+fibo.get(i-1));
			}System.out.println(fibo);
			
			
			
			
			

	}
}
