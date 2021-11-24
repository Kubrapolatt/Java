package day03_Scanner;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
	
	//Eğer büyük daata türündeki bir veriyi daha küçük data türündeki
	//variable a atamak istersek java bunu otomatik olarak yapmaz
		
		int sayi1=140;
		
		short sayi2=(short) sayi1;
		
		//eşitliğin sağı ile solundaki veri türleri farklı olduğundan java mismatch hatası verir
		
		//hatayı düzeltmek için büyük data türündeki değerin önüne manuel onayımızı gösteren 
		
		// (short) yazılır
		
		System.out.println("sayi2 :" + sayi2);
		
		byte sayi3=(byte) sayi2;
		
		System.out.println("sayi3 :" + sayi3);
		// değer buyte ın sınırlarından büyük olduğu için java int
		// 300 u kendi yöntemine göre byte a donuşturur ve bu arada bizim sayımız DEĞİŞİR
		
		
		double sayi4=87.3;
		
		int sayi5= (int) sayi4;
		
		System.out.println("sayi5 : " + sayi5);
				
		//değer virgüllü olduğundan ve int da ondalıklı kısım olmadığından java ondalıklı kısmı siler
		//dolayısıyla hata oluşur
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6 / sayi7);
		//bölme işlemi yapılan sayı da int old için java sonucu int yazar
		
		double sayi8=4;
		
		System.out.println(sayi6/sayi8);
		// 6,75 işlem yapılan sayılardan daha geniş data türüne sahip olan
		//double olduğundan sonucu double olarak yazdırır
		
		
		
		

	}

}
