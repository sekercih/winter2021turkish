package day08;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen haftadan bir g�n giriniz");
		
		String haftaGunleri=scan.nextLine();
		
		if (haftaGunleri.equalsIgnoreCase("pazar")||haftaGunleri.equals("pazartesi")) {
			System.out.println("Paz");
		}else if (haftaGunleri.equalsIgnoreCase("Sali")) {
			System.out.println("Sal");
		}else if (haftaGunleri.equals("Carsamba")) {
			System.out.println("Car");
		}else if (haftaGunleri.equalsIgnoreCase("Persembe")) {
			System.out.println("Per");
		}else if(haftaGunleri.equalsIgnoreCase("Cuma")) {
			System.out.println("Cum");
		}else {
			System.out.println("l�tfen gecerli g�n giriniz");
		}
		
	scan.close();
		
		
		
		
		
		
		
		//String haftaninGunleri=scan.nextLine().toUpperCase().substring(0,1);
		// haftaninGunleri=scan.next().toLowerCase().substring(1, 3);
		
		//System.out.println(haftaninGunleri);
		

	}

}
