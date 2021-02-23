package day09;

public class C1_Ternary1 {

	public static void main(String[] args) {
	 int sayi=101;
	 
	  String result= sayi%2==0? "cift sayi":"tek sayi";
	  
	  System.out.println(result);
	  
	  
	  int y=1;
	  int z=1;
	  int a=y<10?y++:z++;
	  System.out.println(y+","+z+","+a);
	  
	}

}
