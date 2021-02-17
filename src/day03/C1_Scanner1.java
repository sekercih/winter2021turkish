package day03;
import java.util.*;


import javax.swing.JOptionPane;
public class C1_Scanner1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("lüften isim giriniz");
		String name=scan.nextLine();
		
		
		System.out.println("lüften soyisim giriniz");
		String surname=scan.nextLine();
		
		//System.out.println("name ="+name);
		//System.out.println("surname ="+surname);
		JOptionPane.showInputDialog("name ="+name);
		JOptionPane.showMessageDialog(null, "name ="+name);
		JOptionPane.showMessageDialog(null, "surname ="+surname);
		 String sayi = JOptionPane.showInputDialog("Bir sayý giriniz");
	        
	        // Alýnan sayýyý bilgilendirme ekranýyla gösteriyoruz.
	        JOptionPane.showMessageDialog(null, sayi, "Girilen Sayý", JOptionPane.OK_OPTION);
		
		
		scan.close();
		
	}

}
