package day04_IncrementDecrement;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
	
	       // 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 
        //    3.bir variable olmadan degistiren (SWAP) bir program yapiniz
        
        int sayi1=15;
        int sayi2=20;
        
        // baslangicta sayi1=10 ve sayi2=20
        
        
        System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);

        // üçüncü bir variable kullanmayacaksak,verilen iki sayının farkından istifade ediyoruz
        
        
        // ilk adım olarak sayıların farkını ilk sayıya assign ediyorum
        
        sayi1=sayi1-sayi2;
        
        // ikinci adım fark ile sayı ikiyi toplayıp 
        //sayı2 ye assign ediyorum
        
        sayi2=sayi1+sayi2;
        
        // 3.adım olarak sayi1 e sayi2 - fark atıyorum
        
        sayi1=sayi2-sayi1;
        
        System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        
        
        
        
        
        
        
        
        
        
	}

}
