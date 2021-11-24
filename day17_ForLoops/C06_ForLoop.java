package day17_ForLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10’dan kucuk 
		//bir tamsayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

	
	
		Scanner scan=new Scanner (System.in);
		System.out.print("Lütfen 10'dan küçük bir tam sayı giriniz: ");
		
		
		
		int sayı=scan.nextInt();
		System.out.print(sayı+ "!=");
	
	int faktöriyel=1;
	
	for (int i =sayı; i >0; i--) {
	faktöriyel*=i;	
	System.out.print(i +"*");
	
	}
	System.out.print("1=" +faktöriyel);
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}
