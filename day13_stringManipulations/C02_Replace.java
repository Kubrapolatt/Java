package day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// string olarak verilen 10,000 sayısının
		//binden büyük olup olmadığını yazdırın.
		
		
	String sonuç="10.000";
	
	sonuç=sonuç.replace("." , "");//10000 e çevirdik
		                          // = old için sonuç kalıcı olarak değişti
	
	System.out.println(sonuç);	
		
		
	if (Integer.valueOf(sonuç)>1000) {
		System.out.println("bulunan sayı 1000 den çok");
	} else {
        System.out.println("bulunan sayı 1000 den az");
	}
		
		
		
		
		
		
		
		
		
		
	}

}
