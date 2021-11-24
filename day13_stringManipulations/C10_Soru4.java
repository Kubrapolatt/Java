package day13_stringManipulations;

import java.util.Scanner;

public class C10_Soru4 {

	public static void main(String[] args) {
		// Soru 4: Kullanıcıdan isim ve soyismini isteyin
		//ve hangisinin daha uzun olduğunu yazdırın.

	
		Scanner scan=new Scanner (System.in);
		
	    
	    System.out.print("Lütfen isminizi giriniz : ");
	    String isim=scan.next();
	    
	   
	    System.out.print("Lütfen soyisminizi giriniz : ");
        String soyİsim=scan.next();
	    
	   System.out.println("İsim uzunluğu : " + isim.length());
	   
	   System.out.println("Soyisim uzunluğu : " + soyİsim.length());
	   
	   if (isim.length()==soyİsim.length()) {
           System.out.println("girilen isim ve soyisim esit uzunlukta");
       }else if(isim.length()>soyİsim.length()) {
           System.out.println("Girilen isim soyisimden uzun");
       }else {
           System.out.println("Girilen isim soyisimden kisa");
       }
	
	scan.close();
	
	
	}

}
