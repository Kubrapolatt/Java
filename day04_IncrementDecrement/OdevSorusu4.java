package day04_IncrementDecrement;

import java.util.Scanner;

public class OdevSorusu4 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lütfen dikdörtgenler prizmasının uzun kenarını giriniz");
	
	int uzunkenar=scan.nextInt();
	
	System.out.println("Lütfen dikdörtgenler prizmasının kısa kenarını giriniz");
		
	int kısakenar=scan.nextInt();
	
	System.out.println("Lütfen dikdörtgenler prizmasının yüksekliğini giriniz");
	
	int yükseklik=scan.nextInt();
	
	System.out.println("Dikdörtgenler Prizmasının Hacmi : " + (kısakenar*uzunkenar*yükseklik));
	
	
	
	

	}

}
