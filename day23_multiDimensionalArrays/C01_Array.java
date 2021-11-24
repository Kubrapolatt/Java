package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
	
		
		 // Verilen bir array'den istenen degere sahip elementleri silip \\
		// kalani yeni bir array olarak kaydedin ve sonra yeni array'i yazdirin \\

	int arr[]= {3,4,5,6,3,5,8,3,4,9};
	int silinecekEleman=5;
	
	    //array'de yeni eleman ekleyemeyiz veya var olan elemanları silemeyiz \\
       //çünkü array'in declare edilen uzunluğu DEĞİŞMEZ. \\
	
	//Bu soruda istenen elementi sildiğimizde geriye kaç element kalıyor bulmamız lazım \\
   //Silinecek sayı adedini bulalım \\
	
	int sayaç=0;
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==silinecekEleman) {
			sayaç++;
		}
	}
	
	System.out.println(sayaç);
	int yeniArrayUzunluk=arr.length-sayaç;
	
	    //artık yeni array'i oluşturabiliriz.\\
	
	int yeniArr[]=new int [yeniArrayUzunluk];
	
	 //şimdi eski array'deki elemanları birer birer alıp \\
	//silinecek elemana eşit olmayanları yeni array'e atamalıyız.\\
	
	int j=0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]!=silinecekEleman) {
			yeniArr[j]=arr[i];
			j++;
		}
	}
	
	System.out.println(Arrays.toString(yeniArr));
	
	
	}

}
