package day17_ForLoops;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		//Soru 7 ) Interview Question
	    //Kullanicidan bir String isteyin ve Stringi tersten yazdirin. 
		
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("Lütfen tersine yazdırmak için bir kelime giriniz: ");
		
		String kelime=scan.nextLine();

		//kübra
	
	for (int i = kelime.length()-1; i >=0; i--) {
		
		System.out.print(kelime.substring(i,i+1));
		
    
		
	System.out.print(kelime);	
		
		
	}
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	}

}
