package day11_stringManipulation;

public class C04_İndexOf {

	public static void main(String[] args) {
		
	//parametre olarak grlen bir çar veya stringin 
	//ilk indexini verir
		
	String str="Çalışırsanız, Java öğrenmek çok kolay";	
	System.out.println(str.indexOf('s'));	//7
	System.out.println(str.indexOf("J"));	//14
		
		
	int index=str.indexOf('r');// indexof() metodu bize her zaman int bir değer döner 
		
	System.out.println(index);	 //6
		
	System.out.println(str.indexOf('q'));	//-1
	//eğer bir stringin index değeri olarak -1 olarak gelirse o stringn olmadığını anlarız	
	
	System.out.println(str.indexOf('A')); //-1
	
	System.out.println(str.indexOf("va öğ"));
	//aradığımız charSquence anlamlı veya anlamsız bir kelime olablir
	//bu durumda java aradığımız CS i tek bir paket gibi düşünür ve o 
	//paketin indexini buluruz
	System.out.println(str.indexOf('e',15));
	
	}

}
