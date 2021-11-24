package day04_IncrementDecrement;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
	 //scanner işleminde string için iki method vardır
	 //scan.next() dediğimizde sadece bir kelime alır(ilk space e kadar)
     //eğer kullanıcıdan daha fazla gelme ihtimali varsa scan.nextLine() kullanmalıyız
		
     
	Scanner scan=new Scanner(System.in);	
	 
	String isim=scan.next();
	
	System.out.println("Lütfen soyismiinizi giriniz...");
	
	String soyisim=scan.next();
	
	System.out.println("girilen isim : " + isim + " "  + soyisim);
	
	
		
		
	}
	
	

}
