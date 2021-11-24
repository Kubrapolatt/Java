package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCümleleri {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);	
	
	System.out.println("Lütfen dikdörtgenin bir kenar uzunluğunu girin");
		
	double kenar1=scan.nextDouble();
	
	System.out.println("Lütfen dikdörtgenin bir kenar uzunluğunu girin");
	
	double kenar2=scan.nextDouble();
	
	if (kenar1==kenar2) {
		System.out.println("girilen dikdörtgen kare");
	}
	
			
	if (kenar1!=kenar2) {
		System.out.println("girilen dikdörtgen kare değil");
	}
		
			

	}

}
