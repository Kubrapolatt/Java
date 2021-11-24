package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C05_NestedTernary {
 
	public static void main(String[] args) {
		
		// SORU:Eğer çalışan kadınsa 60 yaşından büyük olduğunda emekli olabilir,
				// Çalışan erkekse 65 yaşından büyükse emekli olabilir.	
		
		
		//her seferinde scanner oluşturmak yerine
		//test datalarımızı variable olarak da oluşturabiliirz
		//ve kod yazımı bittiğinde bu test datalarını
		//değiştirerek test edebiliriz
		
		char cinsiyet='E';
		int yaş=98;
		
		String sonuc=cinsiyet=='K' ? (yaş>=60 ? "emekli olabilirsin" : "emekli olamazsın"):
			(yaş>=65 ? "emekli olabilirsin" : " emekli olamazsın");
	
		
		System.out.println(sonuc);
		
		
		
		
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
