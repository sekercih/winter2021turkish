package day13;

public class C8_Examples2 {

	public static void main(String[] args) {
		/*String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		String
		str 1 13 99
		String
		str 2 10 55
		ipucu
		Double parseDouble() methodunu kullanabilirsiniz*/
		
		String str1="$13.99";
		String str2="$10.55";
		
		str1=str1.replace("$", "");
		str2=str2.replace("$", "");
		
		System.out.println(str1);
		
		double str11=Double.parseDouble(str1);
		double str22=Double.parseDouble(str2);
		System.out.println(str11+str22);
	}

}
