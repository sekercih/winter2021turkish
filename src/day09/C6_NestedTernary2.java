package day09;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		/*Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola 
		�Kucuk Harf� , buyuk harfse consola �Buyuk Harf� yoksa 
		�girdiginiz karakter harf degil� yazdirin.
*/
		Scanner scan =new Scanner (System.in);
		System.out.println("harf giriniz");
		char harf = scan.next().charAt(0);
		System.out.println(harf>='a' && harf<='z'? "k���k harf":(
 harf>='A' && harf<='Z' ? "b�y�k harf" :"girdi�iniz karakter harf degil"));
		
		
	}

}
