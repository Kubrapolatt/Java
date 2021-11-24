package day18_nestedForLoop_while_Loop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// kullanıcıdan iki tam sayı isteyin ilk sayıdan başlayarak ikinci sayıya
		//kadar üçer üçer yazdırın.(ikinci sayı dahil olmak zorunda değil.)
	
	
		Scanner scan=new Scanner (System.in);
		System.out.print("Lütfen iki tam sayı giriniz\nBirinci sayıyı girdikten sonra enter a basınız. ");
		
		
		int sayı1=scan.nextInt();
		int sayı2=scan.nextInt();
	
	if (sayı1>sayı2) {//azalarak gidicek
		for (int i = sayı1; i > sayı2; i-=3) {
			System.out.print(i+" ");
		}
	
	
	} else if(sayı1<sayı2) {//artarak gidicek
        for (int i = sayı1; i <=sayı2; i+=3) {
			System.out.print(i+" " );
		}
	
	
	}else {
		 System.out.println("Girilen sayılar eşit.");
	}
	
	scan.close();
	
	
	
	
	}

}
