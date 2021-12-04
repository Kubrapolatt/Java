package day31_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();

		System.out.println(tarihSaat);//2021-12-02T23:45:19.694829300
		
		//Eğer tarih veya saati kendi istediğimiz biçimde yazdırmak istersek
		//Gün / Ay / Yıl  saat:dakika
		
		DateTimeFormatter düzenle=DateTimeFormatter.ofPattern("dd/MMMM/YYYY E  HH : mm");
		
		System.out.println(düzenle.format(tarihSaat));//02/Aralık/2021 Per  23 : 55
		
		/*FORMAT OLUŞTURURKEN 
		 * GÜN
		 * 
		 * d :başta 0 varsa onu yazmadan gün numarasını 
		 * dd :tek haneli günleri 01 gibi başına 0 yazarak gün numarası
		 * DDD :yılın kaçıncı günü olduğunu 
		 * E :gün isminin ilk üç harfini 
		 * EEEE :gün isminin tamamnını 
		 * 
		 * AY(Ay için M dk için m kullanılır)
		 * 
		 * M : başta 0 varsa onu yazmadan ay numarası
		 * MM :tek haneli ayları ayları 01 gibi ayzarak başına 0 yazarak ay numarası
		 * MMM :ay isminin ilk 3 harfi
		 * MMMM : ay isminin tamamını 
		 * 
		 * YIL
		 * 
		 * YY :yılın son 2 rakamını
		 * YYY :yılın tamamını 
		 * 
		 * Saat : (24 saat üzerinde istiyorsak H,12 Saat üzerinden sitiyorsak h)
		 * 
		 * HH : saatin tamamı,tek rakamlı olursa 02 gibi
		 * H : tek rakamlı saat olursa sadece saati
		 * 
		 * a yazarsak AM ya da PM değerini yazar
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
