package day35;

public class Memur extends Personel{
	public int maas;

	public Memur() {
		super();
		System.out.println("Child Class parametresiz constructor çalisti.");
	}
	public Memur(int maas) {
		super();
		System.out.println("Child Class parametreli constructor çalisti.");
	}
	public static void main(String[] args) {
		Memur obj1=new Memur(2000);
	}

}
