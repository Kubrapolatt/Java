package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		
		/*Soru2 ) Kullanicidan bir tamsayi alin 
ve sayinin tek veya cift oldugunu yazdirin*/
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen bir tam sayı giriniz");
		
		int sayı=scan.nextInt();
		
		System.out.println(sayı%2==0 ? "çift sayı " : "tek sayı");
		
		
		scan.close();
		
		
		
		
		
		

	}

}
