package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		
		
		/*Kullanicidan gun ismini alin ve 
        * haftaici veya hafta sonu oldugunu yazdirin 
           Ornek:      gun=Pazar output = “Hafta sonu”
                       gun=Sali output = “Hafta ici”
        *** String icin equals method’unu kullanin
        */


     Scanner scan=new Scanner(System.in);

     System.out.println("Lütfen gün ismini yazınız.");

     String gün=scan.next().toLowerCase();
     
     if (gün.equals("pazar") || gün.equals("cumartesi")) {
		System.out.println("Hafta Sonu");
	}
    
     if (gün.equals("pazartesi") || gün.equals("salı") || gün.equals("çarşamba") || gün.equals("perşembe") || gün.equals("cuma")) {
		System.out.println("Hafta İçi");
	}
		
		
		
		
		
		
		
		
		
		

	}

}
