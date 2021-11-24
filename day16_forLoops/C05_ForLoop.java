package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {



	public static void main(String[] args) {
		// Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
		//1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

	
	Scanner scan=new Scanner (System.in);
	System.out.print("Lütfen yuzden küçük bir sayı giriniz: ");
	double num=scan.nextDouble();
	int sayı=(int) num;
	//sayı negatifse veya tam sayı değilse uyarı verelim
	
	if (num<0) {
		System.out.println("Negatif sayı giremezsiniz!");
	} else if(sayı!=num) {
        System.out.println("Lütfen tam sayı giriniz.");
	} else if(num>100) {
		System.out.println("Lütfen 100'den küçük bir sayı giriniz.");
    }else {
    	for (int i = 1; i <=num; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
    }
		
    }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
