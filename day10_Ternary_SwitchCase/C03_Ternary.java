package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
		
		/*Soru3 ) Kullanicidan bir sayi alin
        ve sayinin mutlak degerini yazdirin	*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("LÜTFEN BİR SAYI GİRİNİZ");
		
		double sayı=scan.nextDouble();
		
		double mutlakDeğer=sayı>=0 ? sayı : (-1)*sayı ;
		
		
		System.out.println(mutlakDeğer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
