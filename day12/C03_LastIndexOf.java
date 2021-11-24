package day12;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		// kullanıcıdan bir cümle ve bir harf isteyin
		//harfin cümlede var olup olmadığını yazdırın

	
	Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen bir cümle giriniz :");
		
		
		String cümle=scan.nextLine();
		System.out.print("Lütfen varlığını kontrol etmek için bir harf giriniz :");
		
		String kelime=scan.next();
	
		
	int ilkIndex=cümle.indexOf(kelime);
	int sonIndex=cümle.indexOf(kelime);
	
	
	if (ilkIndex==(-1)) {
		System.out.println("Girilen kelime cümlede kullanılmamış");
	} else if(ilkIndex==sonIndex) {
        System.out.println("Girilen kelime cümlede 1 kere kullanılmıştır ");
	}else {
		 System.out.println("Girilen kelime cümlede 1 den fazla kullanılmıştır ");
	
	
	}
	
	
	
	
	
	scan.close();
	
	
	}	

}
