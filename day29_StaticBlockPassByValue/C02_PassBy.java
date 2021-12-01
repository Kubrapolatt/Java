package day29_StaticBlockPassByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// 100 tl ye satılan bir ürün için 2 farklı indirim uygulayan iki methoda oluşturalım

	
	
	int fiyat=100;
	
	indirimYap25(fiyat);//%25 indirimli fiyat : 75
	System.out.println("method'dan sonra main method'daki fiyat : "+fiyat);//100
	
	indirimYap10(fiyat);
	System.out.println("method'dan sonra main method'daki fiyat : "+fiyat);
	
	}

	private static void indirimYap25(int fiyat) {
       fiyat*=0.75;
		
		System.out.println("%25 indirimli fiyat : "+fiyat);
		
	}

	private static void indirimYap10(int fiyat) {
		fiyat*=0.90;
		
		System.out.println("%10 indirimli fiyat : "+fiyat);
		
	
	
	
	
	
	}

}
