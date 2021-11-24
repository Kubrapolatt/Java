package day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		
	int x=10;
	
	String tekMiÇiftMi = x%2==0 ? "çift sayı"  :  "tek sayı";
		
		
	System.out.println(tekMiÇiftMi);	//çift
		
		
	System.out.println(x%2==0 ? "çift sayı"  :  "tek sayı");
		
    //ternary iki türlğ kullanılabilir.
	//ya dönen sonuca göre bir variable oluşturup
	//assign ederiz veya direk syso içine yazıp 
	//sonucu yazdırırız
	
	
	// eğer ternary de dönecek sonuçlar aynı 
	//data türünden değiilse atama yapamayız sadece
	//sadece syso ile yazdırabiliriz
	
	
	System.out.println(x >5? "AFERİN" : 4);//AFERİN
	
	
	//String sonuç = x >5? "AFERİN" : 4;
	
	
	
	
	
	
	}

}
