package day17_ForLoops;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin
		//ve Stringi tersine ceviren bir method yazin.


		Scanner scan=new Scanner (System.in);
		System.out.print("Lütfen tersine yazdırmak için bir kelime giriniz: ");
		
		String kelime=scan.nextLine();
	
	  // tersineÇevir(kelime);
	
	  //System.out.println(tersineÇevir(kelime));  ***yazdırmak istersek bu şekilde yazdırıcaz***
	
	scan.close();
	
	}

	public static String tersineÇevir(String kelime) {
	  String tersKelime="";
		
	for (int i = kelime.length()-1; i >=0; i--) {
		tersKelime+=kelime.substring(i,i+1);
		 
	}
	return tersKelime;
	
	
	
	
	}

}
