package day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
	
		/*Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini
isteyin. Girdiği sayi 5’e  bölünüyorsa son
rakamını kontrol edin. Son rakamı 0 ise ekrana
“5’e bölünen  çift sayı” yazdırın. 
Son rakamı 0 değil ise “5’e bölünen 
tek sayı” yazdırın.  
Girdiği password 5’e bölünmüyorsa 
ekrana “Tekrar deneyin” yazdırın.*/	
		
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("Lütfen 4 basamaklı bir sayı girin");
		
		int sayı=scan.nextInt();
		
		if (sayı<1000 || sayı>9999 ) {
			System.out.println("4 Basamaklı sayı girmelisiniz");
		} else {// 4 basamaklı sayıları yakalayacak
            
			if (sayı%5==0) {// 5 e tam bölünenler
			
				if (sayı%10==0) {// son rakam 0 demek yani çift
					
					System.out.println("Beşe tam bölünen çift sayı");
				} else {// son rakam 5 tek
                   
					System.out.println("Beşe tam bölünen tek sayı");
				}
				
				
				
				
			} else { //  5 e tam bölünemeyenler
               System.out.println("Tekrar deneyin.");
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
