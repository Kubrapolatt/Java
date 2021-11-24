package day04_IncrementDecrement;

import java.util.Scanner;

public class OdevSorusu1 {

	public static void main(String[] args) {
		
		

			
			//kullanıcıdan değer almak için Scanner objesi oluşturmamız lazım
				
				
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Lütfen iki tam sayı giriniz");
			
			int sayi1= scan.nextInt();
			int sayi2= scan.nextInt();
			
			System.out.println("Girdiğiniz sayıların toplamı  : " + (sayi1+sayi2));
			

			System.out.println("Girdiğiniz sayıların farkı   : " + (sayi1-sayi2));
			
			System.out.println("Girdiğiniz sayıların çarpımı  : " + (sayi1*sayi2));
			
			
			
	}

}
