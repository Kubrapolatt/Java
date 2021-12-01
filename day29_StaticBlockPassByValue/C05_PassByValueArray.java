package day29_StaticBlockPassByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {


		int sayılar[]= {3,4,5,6};
		
		elemanDeğiştir(sayılar);
		System.out.println("eleman değiştir method'undan sonra : " + Arrays.toString(sayılar));// [10, 4, 5, 6]
		
		arrayiDeğiştir(sayılar);
		System.out.println("array'i değiştir methodundan sonra  : "+Arrays.toString(sayılar));//[10, 4, 5, 6]
		}

	public static void arrayiDeğiştir(int[] sayılar) {
	sayılar=new int[6];
		System.out.println("array'i değiştir methodunda  : "+Arrays.toString(sayılar));//[0, 0, 0, 0, 0, 0]
	}

	public static void elemanDeğiştir(int[] sayılar) {
		sayılar[0]=10;
		System.out.println("eleman değiştir method'unda : " + Arrays.toString(sayılar));//[10, 4, 5, 6]
		
	}

		
		
		
		
		
		
		
		

	
}
