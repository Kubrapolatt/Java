package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWithEndsWith {

	public static void main(String[] args) {
		// kullanıcıdan bir cümle alın ve bir kelime alın
		//verilen cümlenin verilen kelime(char squence) ile
		//başlayıp başlamadığını ve bitip bitmediğini yazdırın.

	
	
	Scanner scan=new Scanner (System.in);
	
	System.out.print("Lütfen bir cümle giriniz : ");
	String cümle=scan.nextLine();
	
	System.out.print("Lütfen bir kelime giriniz : ");
	String kelime=scan.next();
	
	
	if (cümle.startsWith(kelime)) {
		System.out.println("Girilen cümle : " + kelime + " İle başlıyor.");
	} else {
		 System.out.println("Girilen cümle : " + kelime + " İle başlamıyor.");
	}
	
	if (cümle.endsWith(kelime)) {
		 System.out.println("Girilen cümle : " + kelime + " İle bitiyor.");
	} else {
		 System.out.println("Girilen cümle : " + kelime + " İle btmiyor.");
	}
	
	
	
	scan.close();
	
	
	
	
		
	
	
	
	}

}
