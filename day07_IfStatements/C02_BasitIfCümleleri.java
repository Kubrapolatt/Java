package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCümleleri {

	public static void main(String[] args) {
		
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("lütfen bir tam sayı giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdiğiniz sayi çift bir sayi");
		}
		
		if (sayi%2==1) {
			System.out.println("girdiğiniz sayi tek bir sayi");
		}
		

	}

}
