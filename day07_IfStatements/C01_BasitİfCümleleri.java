package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitİfCümleleri {

	public static void main(String[] args) {
		
        /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */


	
		Scanner scan=new Scanner(System.in);
		
	
		
	char ilkHarf=scan.next().toUpperCase().charAt(0);
	//scan.next ten sonra toUpperCase yaparsak 
	//kelimenin tamamını küçük harfe çevirir
	if (ilkHarf=='P') {
		System.out.println("Pazar,Pazartesi veya Perşembe");
	}
		
	if (ilkHarf=='S') {
		System.out.println("Salı");
	}

		
	if (ilkHarf=='C') {
		System.out.println("Carşamba,Cuma veya Cumaretsi");
	}	
		
	if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
		System.out.println("Geçersizs harf girdiniz.Lütfen gün isimlerinden birinin baş harfini yazınız.");
	}	
		
		
		
	}

}
