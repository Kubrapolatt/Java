package day05_matematikselİşlemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
	//kullanıcıdan dört basamaklı bir sayı alıp 
	//rakamlar toplamını yazdırın
		
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Lütfen 4 basamaklı br sayı giriniz");
	
    int sayi=scan.nextInt();
    
    //sayı 6789 olsun
    
    int rakamlarToplamı=0; 
   
    int rakam=sayi%10;//9
    rakamlarToplamı+=rakam;//9
    sayi/=10;//678
    
    rakam=sayi%10; //8
    rakamlarToplamı+=rakam;//17
    sayi/=10;//67
    
    rakam=sayi%10;//7
    rakamlarToplamı+=rakam;//24
    sayi/=10;//6
    
    rakam=sayi%10;//6
    rakamlarToplamı+=rakam;//30
    sayi/=10;//0
    
    System.out.println("Rakamlar toplamı= " + rakamlarToplamı);
    System.out.println("Sayının değeri= " + sayi);
    
    
    
    
    
    
    
    
    
    
    
		
		
		
		
		
	}

}
