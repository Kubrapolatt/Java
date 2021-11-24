package day21_Scope_Arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		//array'in elemanlarını yazdırmak istersek loop ile yaazdırabiliriz
		
		int arr[]= {2,4,5,6,78,89};
		
		//tüm elementleri yazdırabiliriz
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		
		//ya da Arrays Class'ından yardım alıp direk array olarak yazdırabiliriz
		System.out.print(Arrays.toString(arr));
		
		
		

	}

}
