package day12;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		/*Soru 1) Kullanicidan e mail adresini girmesini isteyin, 
		 * mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”, 
		 * @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
		 *  @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		 */
	
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Lütfen e mail adresinizi giriniz :");
	
    String email=scan.next();
    
    int uzunluk=email.length();
    
    int index=email.lastIndexOf("@gmail.com");
    
    if (!email.contains("@gmail.com")) {
		System.out.print("Lutfen gmail adresi giriniz ");
	} else if(index==uzunluk-10) {
		System.out.print("Email adresiniz başarıyla kaydedildi.");
	}else {
		System.out.print("Lütfen yazımı kontrol ediniz.");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
