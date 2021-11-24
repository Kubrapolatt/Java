package day08_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {

	public static void main(String[] args) {
		
		
		// Soru 7)          Kullanicidan 100 uzerinden notunu isteyin.
				//			Not’u harf sistemine cevirip yazdirin.
				//			50’den kucukse “D”,
				//			50 ye eşit ve büyük ve 60 dan küçük ise  “C”,
				//			60 ye eşit ve büyük ve 80 dan küçük ise “B”,
				//			80 ve uzerinde ise “A”	
		
		
	Scanner scan=new Scanner(System.in)	;
	
	System.out.println("Lütfen 100 üzerinden notunuzu giriniz");
		
	double not=scan.nextDouble();
	
	if (not <0  || not>100) {
		System.out.println("lütfen geçerli bir not giriniz");
	} else if(not <50) {
        System.out.println("notunuz:  D" );
	} else if(not <60) {
	     System.out.println("Notunuz : C");
	} else if (not< 80) {
		System.out.println("Notunuz : B");
	}else { 
		 System.out.println("Notunuz :A");
	  }
	
	
	
	
	
	} 
		
	}


