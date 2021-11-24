package day17_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve 
		//aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

	
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen aralarındaki tüm sayıları toplamak için iki tam sayı giriniz: ");
		
		int sayı1=scan.nextInt();
		int sayı2=scan.nextInt();
	
	
	int küçük=0;
	int büyük=0;
	
	
	if (sayı1>sayı2) {
		büyük=sayı1;
		küçük=sayı2;
	}else {
		büyük=sayı2;
		küçük=sayı1;
	}
	
	
	int toplam=0;
	
	for (int i = küçük; i <= büyük; i++) {
		
	toplam+=i;
	
	
	}
	
	System.out.println("Girilen sayı ve aralaraındaki sayıların toplamı : "+toplam);
	}

}
