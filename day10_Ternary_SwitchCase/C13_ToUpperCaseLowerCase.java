package day10_Ternary_SwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
	
	//verilen stringin tamamını
	//büyük veya küçük harfe çevirir	
		
		
	String isim="aLI"	; // bunu Ali olarak yazdıralım
	
	System.out.println(" "+isim.toUpperCase().charAt(0)+
			          isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));
		
		
	//türkçe lokal harfler kullanarak 
	//tamamını küçük harfe çevirelim
		
		
	System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));	
		
		
		
		
		
		

	}

}
