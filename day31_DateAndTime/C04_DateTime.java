package day31_DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		 // Bir string ve bir int variable oluşturalım.
        //Bir loop içerisinde bu variable'ları 1000 kere değiştirelim
	   //ve işlem sürelerini kıyaslayalım
	
	
	//verien iki doğum tarihinin hangisinin daha önce olduğunu bulunuz
	
	
       LocalTime saat=LocalTime.now();
		
		System.out.println("Başlanıç saati : " + saat);//23:03:10.817134600
		
		int sayı=10;
		
		for (int i = 0; i <100000; i++) {
			sayı++;
		}
		
		LocalTime saatBitiş=LocalTime.now();
        System.out.println("Bitiş saati : " + saatBitiş);
		
		//Eğer bir işlemin başlangıç ve bitiş zamanını kaydetmek istiyorsak
		//hem başında hem de sonunda LocalTime objesi oluşturmalıyız
		
	
	   double nano1=saat.getNano();
	   double nanoBitiş=saatBitiş.getNano();
	
	   System.out.println( "int For loop " + (nanoBitiş-nano1)+" nano saniyede tamamladı.");
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	   LocalTime saatS=LocalTime.now();
		
		System.out.println("Başlanıç saati : " + saat);//23:03:10.817134600
		
		String str="Kübra";
		
		for (int i = 0; i <10000; i++) {
			str+= " ";
		}
		
		LocalTime saatBitişS=LocalTime.now();
       System.out.println("Bitiş saati : " + saatBitişS);
		
		//Eğer bir işlemin başlangıç ve bitiş zamanını kaydetmek istiyorsak
		//hem başında hem de sonunda LocalTime objesi oluşturmalıyız
		
	
	   double nanoS=saat.getNano();
	   double nanoBitişS=saatBitişS.getNano();
	
	   System.out.println( "String For loop " + (nanoBitişS-nanoS)+" nano saniyede tamamladı.");
	
	   double stringSüre=nanoBitişS-nanoS;
	   double intSüre=nanoBitiş-nano1;
	
	   System.out.println("int,String'den  " +(stringSüre-intSüre) + "nano saniye daha hızlı bitirdi.");
	   
	   System.out.println(saat.getMinute()); //29
	   System.out.println(saat.plusMinutes(10000));  //22:09:57.638454400
	   

	  LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
	
	System.out.println(yerelSaat); //23:36:11.889207300

	
	
	
	
	
	
	
	
	
	
	
	}

}
