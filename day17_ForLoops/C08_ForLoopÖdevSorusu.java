package day17_ForLoops;

import java.util.Scanner;

public class C08_ForLoopÖdevSorusu {

	public static void main(String[] args) {
		// 

	

		Scanner scan=new Scanner (System.in);
		System.out.print("Lütfen pozitif bir rakam giriniz: ");
		
		
		int sayı=scan.nextInt();
	
	
	
	for (int i = 0; i <=sayı; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		  System.out.println("");
	}
	
	      
	
	}

}
