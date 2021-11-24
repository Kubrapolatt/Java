package day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
	
      // "Java öğrendim,  #çok para ?kazandım.,"
	 // cümlesinin kelimelerini,özel karakterler ve noktalama işaretleri
    // olmadan harf sırasına göre yazdırın
	
	
	String cümle = "Java ogrendim,  #cok para ?kazandım.,";
	
	String kelimeler[]=cümle.split(" ");
	
	System.out.println(Arrays.toString(kelimeler)); //[Java, öğrendim,, , #çok, para, ?kazandım.,]
	
	for (int i = 0; i < kelimeler.length; i++) {
		kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
	}
	
	System.out.println(Arrays.toString(kelimeler)); //[Java, ogrendim, , cok, para, kazandm]
	
	Arrays.sort(kelimeler);
	
	
	@SuppressWarnings("unused")
	String yeniCümle =" ";
	for (int i = 0; i < kelimeler.length; i++) {

		System.out.print(kelimeler[i] + " ");  //Java cok kazandm ogrendim para 
	}
	

	
	
	
	
	}

}
