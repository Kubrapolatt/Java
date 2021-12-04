package day31_DateAndTime;

import java.time.LocalTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		
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
	
	   System.out.println("For loop " + (nanoBitiş-nano1)+" saniyede tamamladı.");
	
	}

}
