package day21;

public class Scope1 {
	static int okulId = 1201;
	static String okulAdi = "Yildiz Okullari";
	static boolean acikMi;

	public static void main(String[] args) {
		System.out.println(okulAdi + "" + okulId + "" + acikMi);
		okulId = 1202;
		acikMi = true;
		staticMethod();
		System.out.println(okulAdi + "" + okulId + "" + acikMi);
	}

	public static void staticMethod() {
		System.out.println(okulAdi+""+okulId+""+acikMi);
		okulId=1203;
	}

	public void method() {
		okulId = 1205;
	}
}
