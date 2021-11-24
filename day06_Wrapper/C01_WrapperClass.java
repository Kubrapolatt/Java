package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
	int sayi1=10;
	Integer sayi2=20;
	
	
	//sayi1. yazdığımızda hiçbir method çıkmaz çünkü sayi1 
	//int dır yani primitive dir
		
    //sayi2. yazdığımıza ise bir çok method geliyor çünkü
    //sayi2 Integer dir yani nonprimitive dir ya da Wrapper dır
		
	String tel1="3578987";
	String tel2="3245434";
	
	
	System.out.println(tel1+tel2); 
	System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
	
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);
	
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	
	//String caddeNo="B203";
	
	String caddeNo="203";
	String sokakNo="1564";

	System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
	
	
	//Integer.valueOf(String numerik ifade)methodu string olarak
	//kaydedilmiş numerik ifadeleri sayıya çevirir
	//JavaNumberFrmatException hatası verir ve çalışmayı durdurur.
	//stop execution 
	
	System.out.println("hello world");
	
	
	}

}
