package day19_WhileLoop_DoWhileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		//Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen rakamla toplamını bulmak için pozitif bir tam sayı girin :");
		
		int sayı=scan.nextInt();
	
	    int rakamlarToplamı=0;
	    int rakam=0;
	
	while (sayı>0) {
		rakam=sayı%10;
		rakamlarToplamı+=rakam;
		sayı/=10;
	}
	
	System.out.println("Girdiğiniz sayının rakamlar toplamı :" + rakamlarToplamı);
	
	scan.close();
	
	}
}