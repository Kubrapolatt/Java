package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
	
     //"Java öğrenmek çok güzel"
	//cümlesinin kelimelerini ters sırada yazdırın


  
    String cümle="Java öğrenmek çok güzel";

    String kelimeler[]=cümle.split(" ");

    System.out.println(Arrays.toString(kelimeler));  //======> [Java, öğrenmek, çok, güzel]

    for (int i = kelimeler.length-1; i >=0; i--) {
		System.out.print(kelimeler[i]+" ");         //======> güzel çok öğrenmek Java 
	}

   






}
}
