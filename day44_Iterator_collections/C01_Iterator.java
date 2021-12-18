package day44_Iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		
		
		List<Integer>liste=new ArrayList<>();
	
	    liste.add(5);
	    liste.add(4);
	    liste.add(9);
	    liste.add(7);
	    liste.add(3);
	    liste.add(1);
	
	   System.out.println(liste);//[5, 4, 9, 7, 3, 1]
	
	//index kullanmadan tüm elemanları 3 eklenmiş olarak yazdırın
	   
	   
	   for (Integer each : liste) {
		System.out.print(each+3+ " ");//8 7 12 10 6 4  
	}
	   
	  System.out.println(" ");
	
	  
	  System.out.print(liste); 
	   
	   
	   //for each loo kullanmadan tüm elementlere ulaşabiliyoruz
	  //ama kalıcı değişiklik yapamıyoruz
	   
	   
	   
	
	
	}

}
