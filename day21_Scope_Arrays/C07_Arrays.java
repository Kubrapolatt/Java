package day21_Scope_Arrays;

import java.util.Arrays;

public class C07_Arrays {

	public static void main(String[] args) {
		// Arrayin tüm elementlerini önce küçükten büyüğe sonra büyükten küçüğe yazdırın

	
		int arr[]= {3,5,8,63,32,34};
	
	Arrays.sort(arr);
	System.out.print(Arrays.toString(arr));
	
	//büyükten küçüğe yazdırmak için
	//ya for loop ile elemanları ters sırada yazdırırız
	
	System.out.println("");
	
	
	for (int i = arr.length-1; i >=0; i--) {
		System.out.print(arr[i]+" ");
	}
	
	//array tyapmak isterseniz aynı uzunlukta bir array oluşturup
	//elemanları ters sırada yeni array e taşıyabiliriz
	
	int tersArray[]=new int[arr.length];
	
	for (int i = 0; i < tersArray.length; i++) {
		tersArray[i]=arr[arr.length-1-i];
	}
	System.out.print(Arrays.toString(tersArray));
	
	}

	
}
