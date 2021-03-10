package day22;

public class Car {
	String marka;
	String model;
	int yil;
	boolean kazasiVarmi;

	public static void main(String[] args) {
		Car car1=new Car();
		car1.marka="honda";
		car1.model="sedan";
		car1.yil=2010;
		car1.kazasiVarmi=true;
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarmi+" "+" ");
		
		Car car2=new Car();
		car2.marka="opel";
		car2.model="spor";
		car2.yil=2011;
		car2.kazasiVarmi=true;
		System.out.println(car2.marka+" "+car2.model+" "+car2.yil+" "+car2.kazasiVarmi+" "+" ");
		

	}

}
