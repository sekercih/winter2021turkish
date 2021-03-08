package day20;

import java.lang.reflect.Method;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Scope1 {
	int sayi;
	String isim="hakko07";
	String soyisim="dede";

	public static void main(String[] args) {
		staticMethod();
		// method(); static olmadýðý için çalýþmaz.
		
		//sayi=2;
		Scope1 obj=new Scope1();
		System.out.println(obj.sayi);
		System.out.println(obj.isim);
		System.out.println(obj.soyisim);
		obj.isim="koraman";
		obj.soyisim="toromon";
		System.out.println(obj.isim);
		System.out.println(obj.soyisim);

	}

	public static void staticMethod() {
		System.out.println("Static method calýsti");
	}

	public void method() {


	}

}
