package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen dikdörtgenin bir kenar uzunluğunu giriniz");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lütfen dikdörtgenin diğer kenar uzunluğunu giriniz");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen ölçüler kare");
		} else {
             System.out.println("girilen ölçüler kare değildir");
		} 
		
		
		
		
		
		
	}

}
