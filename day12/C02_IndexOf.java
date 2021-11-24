package day12;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {
		/*Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin 
		cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 - Girilen kelime cumlede kullanilmamis.
		 - Girilen kelime cumlede 1 kere kullanilmis.
		  -Girilen kelime cumlede 1’den fazla kullanilmis.*/
	
	
	Scanner scan=new Scanner (System.in);
	System.out.print("Lütfen bir cümle giriniz :");
	
	String cümle=scan.nextLine();
	System.out.print("Lütfen varlığını kontrol etmek için bir kelime giriniz:");
	
	String kelime=scan.next();
	
	int index=cümle.indexOf(kelime);
	
	if (index<0) {
		System.out.print("Girilen kelime cümlede kullanılmamaktadır.");
	
	}else if(cümle.indexOf(kelime, index+1)<0){
	
	   System.out.print("Girilen kelime cümlede 1 kere kullanılmaktadır");
	
	}else {
		System.out.print("Girilen kelime cümlede 1 den fazla kullanılmaktadır");
	}
	scan.close();
}
	}
	
	
	
	
		
	
		
		


	
	
	
	


