package day32;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("Hakki");
		System.out.println(stb);
		stb.append(" ").append("Sekerci");
		System.out.println(stb);
		stb.append("Javayicoksever", 6, 9);
		System.out.println(stb);
		System.out.println(stb.length());
		System.out.println(stb.capacity());

		System.out.println(stb.charAt(1));
		System.out.println(stb);
		System.out.println(stb.insert(5, " "));
	}

}
