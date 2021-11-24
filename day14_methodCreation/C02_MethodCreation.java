package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// // Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
        // kullaniciya üs sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
        


	  Scanner scan=new Scanner (System.in);
			  
	  System.out.println("Lütfen iki sayı giriniz \nİlk sayıdan sonra enter a basın ");
	 
	  double sayı1=scan.nextDouble();
	  double sayı2=scan.nextDouble();
	
	 
	  System.out.println("Girilen sayıların kareler toplamını istiyorsanız 2 ,"
	  		+ "\nküpler toplamını istiyorsanız 3'e basın.");
	
	  int seçim=scan.nextInt();
	  
	  switch(seçim) {
	  
	  case 2:
		  kareTopla(sayı1,sayı2);
	      break;
	  case 3:
		  küpTopla(sayı1,sayı2);
	      break;
	  default:
		  System.out.println("Lütfen istenen tercihlerden birini yazınız.");
	  
	  }
	   //kareTopla(sayı1,sayı2); ihtiyaç yok.Method oluşturuldu
	  //küpTopla(sayı1,sayı2);  ihtiyaç yok.Method oluşturuldu
	
	  scan.close();
	  
	
	}

	public static void küpTopla(double sayı1, double sayı2) {
		double küplerToplamı=sayı1*sayı1*sayı1+sayı2*sayı2*sayı2;
		System.out.println("Girilen sayıların küpler toplamı : "+küplerToplamı);
	}

	public static void kareTopla(double sayı1, double sayı2) {
		
		// bizim arguman isimlerimizle parametre isimlerimz aynı olmak sorunda değil
		//java isimlere değil değerlere bakar
		//bu bir zorunluluk değl imkandır istediğimizi tercih edebiliriz
	
	    double karelerToplamı=sayı1*sayı1+sayı2*sayı2;
		System.out.println("Girilen sayıların kareleri toplamı : "+karelerToplamı);
	
	 
	
	}

}


