package day13_stringManipulations;

import java.util.Scanner;

public class C06_ŞifreSorusu {

	public static void main(String[] args) {
		

		/*Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        isim-soyisim : M***** B*******
         kart no : **** **** **** 1234*/

	Scanner scan=new Scanner(System.in);
	System.out.print("Lütfen isminizi giriniz :");		
	
	String isim=scan.next();
	
	System.out.print("Lütfen soyisminizi giriniz :");
	
	String soyİsim=scan.next();
	
	System.out.println("Lütfen 16 haneli kart numaranızı boşluk bırakmadan yazınız :");
	
	String kkNo=scan.next();
	
	String isimFormatli=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w" , "*");
	String soyİsimFormatli=soyİsim.substring(0,1).toUpperCase()+soyİsim.substring(1).replaceAll("\\w", "*");
	String kkNoFormatli=" **** **** **** **** "+ kkNo.substring(12);
	System.out.println("İsim-Soyisim : " + isimFormatli + " " + soyİsimFormatli );
	System.out.println("Kart no : " + kkNoFormatli);
	
	
	
	}

}
