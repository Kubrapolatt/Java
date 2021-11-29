package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List <String>isimler=new ArrayList<>();
        System.out.println("Boş liste : " + isimler); //Boş liste : []

        
        ///////////////////// add methodu listenin sonuna ekleme yapar /////////////////////
        
        isimler.add("Kübra");
	    System.out.println("Bir eleman : " + isimler); //Output: Bir eleman : [Kübra]
	
	    isimler.add("Gülseven");
	    System.out.println("İki eleman : " + isimler);  //Output : İki eleman : [Kübra, Gülseven]
	  
	    isimler.add(1, "Orhan");
	    System.out.println("1. indexe Musab ekledik : " + isimler);//1. indexe Musab ekledik : [Kübra, Orhan, Gülseven]
	    
	    //  isimler.add(5); declare belirttiğimiz data türü dışında bir data turunden ekleme yapamayız
	    
	    List <String> liste2=new ArrayList<>();
	    liste2.add("Talha");
	    liste2.add("Musab");
	    System.out.println("Liste 2 : "+ liste2);//Liste 2 : [Talha, Musab]
	
	    isimler.addAll(3, liste2);
	    System.out.println("Liste 2'yi ekledik :"+isimler);//Liste 2'yi ekledik :[Kübra, Orhan, Gülseven, Talha, Musab]
	
	    isimler.addAll(liste2);
	    System.out.println("İndex olmadan liste 2'yi tekrar ekledik :"+isimler);//İndex olmadan liste 2'yi tekrar ekledik :[Kübra, Orhan, Gülseven, Talha, Musab, Talha, Musab]
	
	}

}
