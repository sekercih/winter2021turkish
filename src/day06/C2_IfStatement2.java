package day06;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayi girin");
		int num=scan.nextInt();
		
		if(num%2==1||num%2==-1) {
			System.out.println("sayý tektir");
		}
		if(num%2==0) {
			System.out.println("sayi çifttir");
		}
		
		System.out.println("katýldýðýnýz için teþekkür ederiz");
		
		

	}

}
