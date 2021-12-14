package day40;


import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

        //Kullanıcıdan istediği kadar sayı alıp bu sayıları toplayan bir program yazınız.
		//SAYI GİRİŞİNİ BİTİRMEK İÇİN Q'YA BASINIZ.
	
		
		@SuppressWarnings("resource")
		public static void main(String[] args) {
	
			int sayi=0;
			int toplam=0;
			int count=0;
			
			Scanner scan = new Scanner(System.in);
			// 
			
			
			try {
				while(count<10000) {
					
					System.out.println("Lutfen toplamak icin bir sayi yaziniz \nBitirmek icin sayi disinda bir tusa basiniz");
					sayi=scan.nextInt();
					toplam+=sayi;
					count++;
					
				}
				
			} catch (InputMismatchException e) {
				
				System.out.println("girrdiginiz " + count + " adet sayinin toplami : " + toplam);
				
			}
			
			
			
   
   
   
   
   
   
   
   
   
  
  
   
   
   

	}

}
