package day04_IncrementDecrement;

public class C02_SwapVariables {

	public static void main(String[] args) {
	
       /* 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 ve sayi2=10
     */

      int sayi1=10;
      int sayi2=20;
      
      // başlangıçta sayi1=10 ve sayi2=20 
      
      
      
      
      
      System.out.println("başlangıçta sayi1=" + sayi1 + " ve sayi2=" + sayi2 );
      
      // ilk önce boş bir variable oluşturalım 
      
      int bos;
      
      //ikinci adım sayi2 yi bos variable'a atayalım
      
      sayi2=sayi1;
      
      // boş variable daki sayı1 e atayalım
      

      
      bos=sayi2;
   // üçüncü adım sayi2 variable'ına sayi1 değerini atayalım;
      sayi1=bos;
      
      System.out.println("sonucta sayi1="+ sayi1 + "ve sayi2=" + sayi2);
		
	}

}
