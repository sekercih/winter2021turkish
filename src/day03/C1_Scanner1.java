package day03;
import java.util.*;


import javax.swing.JOptionPane;
public class C1_Scanner1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("l�ften isim giriniz");
		String name=scan.nextLine();
		
		
		System.out.println("l�ften soyisim giriniz");
		String surname=scan.nextLine();
		
		//System.out.println("name ="+name);
		//System.out.println("surname ="+surname);
		JOptionPane.showInputDialog("name ="+name);
		JOptionPane.showMessageDialog(null, "name ="+name);
		JOptionPane.showMessageDialog(null, "surname ="+surname);
		 String sayi = JOptionPane.showInputDialog("Bir say� giriniz");
	        
	        // Al�nan say�y� bilgilendirme ekran�yla g�steriyoruz.
	        JOptionPane.showMessageDialog(null, sayi, "Girilen Say�", JOptionPane.OK_OPTION);
		
		
		scan.close();
		
	}

}
