package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		
		/*Soru4 ) Kullanicidan bir sayi alin. 
		 * Sayi pozitifse “Sayi pozitif” yazdirin,
negatifse  sayinin karesini yazdirin*/	
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lütfen bir sayı giriniz");
		
		double sayı=scan.nextDouble();
				
System.out.println(sayı>0 ? "sayı pozitif" : sayı*sayı );
		
	scan.close();	
		
		
		
		

	}

}
