package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		//Kullanicidan iki sayi alin
		//ve buyuk olmayan sayiyi yazdirin
	
	
	   Scanner scan=new Scanner (System.in);
	   
	  System.out.println("lütfen bir sayı giriniz");
	
	double sayı1=scan.nextDouble();
	
	System.out.println("lütfen bir sayı daha giriniz");
	
	double sayı2=scan.nextDouble();
	
	System.out.println(sayı1>sayı2 ? sayı2 : sayı1);
			
	scan.close();
	
	
	
	
	}
	
	

}
