package day28;

public class C1_ForEachLoop2 {

	public static void main(String[] args) {
		int[]arr= {1,2,1,2,4,3,1,2};
		int carp=1;
		for (int i : arr) {
			carp=i*carp;
			
		}System.out.println(carp);
		

	}

}
