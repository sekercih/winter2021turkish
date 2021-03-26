package day36;

public class UstaBasi extends Isci{
	public String bolum="takimHane";
	public int sorOldIsciSay=20;

	public static void main(String[] args) {
		UstaBasi ub1=new UstaBasi();
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIsciSay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
		
		Isci ub2=new UstaBasi();
		System.out.println(ub2.deparman);
		System.out.println(ub2.izindeMi);
		
		Personel ub3=new UstaBasi();
		
		System.out.println(ub3.isim);
		
		Personel ub4=new Personel();
		System.out.println(ub4.isim);
		
		
	}

}
