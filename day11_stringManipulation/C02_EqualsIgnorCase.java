package day11_stringManipulation;

public class C02_EqualsIgnorCase {

	public static void main(String[] args) {
		
	//equalsIgnorCase iki stringi karşılaştırırken
	//case sensitive olmadan kıyaslama yapar
		
		String str1="kübra";
		String str2="polat"	;
		String str3="Kübra Polat";	
		String str4=str1+" "+str2;
		
		System.out.println(str4); //kübra polat
        System.out.println(str3==str4); //false	hem değerler hem de referanslar farklı
		System.out.println(str3.equals(str4)); // false değerleri farklı
		
		
		System.out.println(str3.equalsIgnoreCase(str4)); //büyük küçük harf farketmez önemli olan içerik ama boşluklar önemlidir
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
