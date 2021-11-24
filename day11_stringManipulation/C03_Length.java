package day11_stringManipulation;

public class C03_Length {

	public static void main(String[] args) {
		
	String str1="Ali Kahyaoğlugiller";
	System.out.println(str1.length()); //13
		
	//son harfini yazdırın
	
	System.out.println(str1.charAt(str1.length()-1));//a
		
	String str2="";
	System.out.println(str2.length());//0
		
	String str3=null;
   // System.out.println(str3.length());//hata verir
		
		
	String str4;	
		
	System.out.println(str3);//null değeri bizim bu variable ı bilerek oluşturduğumuzu
	                         //ve bilerel değer atamadığımızı belrtiyor.
	
	
	
	//System.out.println(str4);//Eğer stringi oluşturup değer atamazsak yazdırdığımızda hata alırız.
		
	//null pointer oluşturduğumuz fakat sonra kullanacağımız
	//bir stringi işaretlemek için kullanılır
	//bir stringi yazdırdığımızda null ıkıyorsa türkçe olarak
	//"BEN BU DEĞİŞKENİ OLUŞTURDUM AMA HENÜZ DEĞER ATAMADIM"
	//demek istiyor.
		
	
	
	
	
	}
	

}
