package day01_02_Variables;

public class C01_Variables {
	public static void main(String[] args) {
		
		// variable oluşturmak ve değer atamak farklı işlemlerdir
		// istersek variable oluşturma ve değer atamayı tek satırda yapabiliriz
		
		String ogrenciIsim = "Musab"; 
		
		System.out.println(ogrenciIsim);//musab
		
		
		int sayi;
		sayi=10 ;
		
		System.out.println(sayi);//10
		
		//biz daha önce oluşturulmuş ve değer ataması yapılmış bir değişkene 
		// yeni değer atayabiliriz
		// bu durumda java variable'in eski değerini silip yeni değeri variable'a atar
		
		sayi=25;
		
		System.out.println(sayi);//25
		
		ogrenciIsim="Kübra";
		
		System.out.println(ogrenciIsim);//Kübra
		
		
		
	}

}
