package day34;

public class Isci extends Muhasebe {
	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.isim="Omer";
		isci1.soyisim="Aydin";
		isci1.id=1001;
		isci1.saatUcreti=10;
		isci1.izindeMi=false;
		isci1.statu="isci";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.id+" "+isci1.isim+" "+isci1.soyisim
				+" "+isci1.maas+" tl");
		
		Isci isci2=new Isci();
		isci2.isim="Fetih";
		isci2.soyisim="Saydin";
		isci2.id=1002;
		isci2.saatUcreti=15;
		isci2.izindeMi=false;
		isci2.statu="isci";
		isci2.maas=isci2.maasHesapla();
		
		System.out.println(isci2.id+" "+isci2.isim+" "+isci2.soyisim
				+" "+isci2.maas+" tl");
	}
	
	/*1) public olan class �yelerine o class dan obje �reterek ula�abiliyorduk
	 2) inheritance sayes�nde obje uretti�imiz class dan (yukar� do�ru) 
	 parent class lara ula�abiliyoruz.
	 extends olunca olu�turdu�umuz class dan yukar� do�ru 
	 (child den parent lara) hepsine ula�abiliyoruz.
	*/
	
	

}
