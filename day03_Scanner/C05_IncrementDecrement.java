package day03_Scanner;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
	//atama işlemi olursa sayının değeri kalıcı olarak değişir
		//atama işlemi olmadan yapılan toplama cıkarma vs işlemler
		//sadece o satırda yapılır sayının değerini kalıcı olarak değiştirmez
	
		int sayi1=10;
	
	System.out.println(sayi1+=5);//15
	//bu işlem sayi1 in değerini 5 artırıp sayi1 e assign ediyor
	//dolayısıyla sayi1 in değeri kalıcı olarak değişiyo
	
	
	System.out.println(sayi1);//15
	
	System.out.println(sayi1+12);//27
	
	sayi1++;
	
	System.out.println(sayi1);//15
	
	//her ne kadar = işareti gözükmesede sayi1++ işleminde assign vardır
	//dolayısıyla değer kalıcı olarak değişir
	
	
	
	
	
	
	
	
	}

}
