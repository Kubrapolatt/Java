package day06_Wrapper;

public class C04_If {

	public static void main(String[] args) {
		
	int a=10;
	int b=20;
	
	if (a>5) { 
		System.out.println("a sayısı 5'ten büyük");
		
	}//true ise eğer syso daki cümle yazılır
		
	if (a>b) {
		System.out.println("a sayısı b den büyük");
	}//false ise yazılmaz kod çalışır fakat yazdırmaz	
		
	if (b>100) {
		System.out.println("b sayısı 100'den büyük");
	}//	kod çalışır fakat yazdırmaz
		 
    //a ya 5 verdiğimizde kod çalışır ama if cümleleri doğru 
	//olmadığı için ekranda kırmızı yazı çıkmaz boş ekran olur 
	//ama kod çalışır
	//basit if cümleleri bağımsız çalışır her bir if cümlesi
	//kendi şartına bakar,şart true ise body çalışır.
	//şart false ise body çalışmaz.
	
	}

}
