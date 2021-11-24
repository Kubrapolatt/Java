package day21_Scope_Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

	int arr[]= {3,5,8,63,32,34};
	
	int toplam=0;
	
	for (int i = 0; i < arr.length; i++) {
		toplam+=arr[i];

	}
	
	
	System.out.println("Elementlerin toplamı : " + toplam);
	
	
	
	
	
	
	}

}
