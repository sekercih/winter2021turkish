package day24;

public class Arrays03 {

	public static void main(String[] args) {
		// Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		int []arr= {1,2,3,4,5,55};
		
		int count=0;
		for (int i : arr) {
			count=count+i;
		}System.out.println(count);

	for (int j = 0; j < arr.length; j++) {
		System.out.print(arr[j]+" ");
	}
	}
	

}
