package day29_StaticBlockPassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		
		 //Bir list oluşturalım
	     //sonra list elemanlarını değiştir methodu yazıp orada
		 //list elemanlarından bazılarını değiştirelim
         //method void olsun
		 //main method'a döndükten sonra yenden list'i yazdıralım
	
	List  <String> harfler=new ArrayList <>();
	harfler.add("A");
	harfler.add("B");
	harfler.add("C");
	
    listElemanlarDeğiştir(harfler);//[D, B, C]
	System.out.println("Method'a dönünce list : " +harfler);//[D, B, C]
	
	    //Javada list ve array gibi objeler için pass By Value geçerlidir
		//Yani farklı bir method'da array veya list'e yeni değer ataması yaparasanız 
		//orijinal array veya list değişmez
	
	listDeğiştir(harfler);//method'da yeni değer atadığım halde harfler listesi değişmedi
	System.out.println("List'e yeni list atadıktan sonra main method'a dönünde list : "+harfler);
	}

	public static void listDeğiştir(List<String> harfler) {
		
		harfler=new ArrayList <>();
		System.out.println("List' yeni değer atayınca : " +harfler);
	}

	public static void listElemanlarDeğiştir(List<String> harfler) {
	
		harfler.set(0, "D");
		System.out.println("Method'da değiştirdiğimiz list : " +harfler);
		
	}

	
	
	
	
	
	
	
	
	
}
