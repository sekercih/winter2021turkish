package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		String ismim="hakki";
		
		System.out.println(ismim.toUpperCase());
		
		byte sayi=10;
		
		Byte sayi2=11;
		
		Byte sayi3Byte=Byte.MAX_VALUE;
		System.out.println(sayi3Byte);
		
		int num=Integer.MAX_VALUE;
		
		System.out.println("int max value = "+num);
		
		long longmaximum=Long.MAX_VALUE;
		System.out.println("longmaximum ="+longmaximum);
		
		short maxShort=Short.MAX_VALUE;
		
		System.out.println("maxShort ="+maxShort);
		
		char karakter=Character.MAX_HIGH_SURROGATE;
		
		
		System.out.println(Character.MAX_HIGH_SURROGATE);
		System.out.println(Character.MIN_HIGH_SURROGATE);
		
		System.out.println(Character.BYTES);
		System.out.println(Character.MAX_VALUE);

	}

}
