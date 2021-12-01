package day29_StaticBlockPassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		
		// main methodlardan diğer methodlara veya diğer methodlardan main methoda bir variable gönderirseniz 
		//Java orijinal variable'ları değil onların değerlerini(Value) götürür,orijinal
		//variable'ın değer değişmez.

		
		
		int fiyat=100;
		
		System.out.println(indirimYap25(fiyat));//75
		System.out.println("method'dan sonra main method'daki fiyat : "+fiyat);//100
		
		//indirimi kalıcı yapmak istiyorsanız main method'a atama yapmanız gerkir
		fiyat=indirimYap10(fiyat);//method'dan sonra main method'daki fiyat : 90
		
		System.out.println("method'dan sonra main method'daki fiyat : "+fiyat);
		
		}

		private static int indirimYap25(int fiyat) {
	       fiyat*=0.75;
			
			return fiyat;
			
		}

		private static int indirimYap10(int fiyat) {
			fiyat*=0.90;
			
			return fiyat;
			
		
		
		
	
	
	
	
	
	
	
	
	
	}

}
