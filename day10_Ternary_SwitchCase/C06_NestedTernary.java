package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C06_NestedTernary {

	public static void main(String[] args) {
	// Soru2 : Kullanicidan bir harf isteyin
	 // kucuk harf ise consola “Kucuk Harf” ,
	// buyuk harfse consola “Buyuk Harf”
	// yoksa “girdiginiz karakter harf degil” yazdirin.	
	
		
	char karakter='A';
	
	//String sonuç= (karakter>='a' && karakter <='z') ? 
			//"küçük harf" : (// sart yanlış ise sonuç); 
	
   String sonuç= (karakter>='a' && karakter <='z') ? "küçük harf" : ( (karakter>='A' && karakter <='Z') ?
						"büyük harf" : "girilen karakter harf değil" 
							);
		
		System.out.println(sonuç);
		
		
		
		
		
		
		
		
		
		
	}

}
