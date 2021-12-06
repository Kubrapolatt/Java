package day32_Varargs_StringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
	
		

		KafanaGöreİşlem(5,10,13,0);
		
		//Varargs'da hiç eleman olmasa da Java itiraz etmez
		//Önce int olarak tanımlanan sayıları eşleştirir.
		//Kalan tüm sayıları varargs'a doldurur.
		
	}

	private static void KafanaGöreİşlem(int sayı1,int sayı2,int sayı3,int...sayılar) {
	int toplam=0;	
	
	for (int each : sayılar) {
		
		toplam+=each;
		}
	
	System.out.println("Girilen sayıların toplamı :" + sayı1*toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
