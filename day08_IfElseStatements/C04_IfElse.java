package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		
//Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin. 
//Diger durumlarda ekrana “Eskenar degil” yazdirin.
		
	Scanner scan=new Scanner(System.in)	;
	
System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz\n ilk kenarı girdikten sonra diğer kenarlar için enter a basınız");
	
	int kenar1=scan.nextInt();
	int kenar2=scan.nextInt();
	int kenar3=scan.nextInt();
	
	if (kenar1==kenar2 && kenar2==kenar3) {
		System.out.println("eşkenar üçgen");
	} else {
        System.out.println("eşkenar üçgen değil");
	}	
		
		
		
		
		

	}

}
