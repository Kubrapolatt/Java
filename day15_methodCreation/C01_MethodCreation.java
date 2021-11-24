package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanıcıdan ismini ve soyismini isteyin
		//iki farklı method oluşturun methodlaran biri girilen
		//kelimeleri ilk harf büyük,diğerleri küçük olacak şekilde birleştrsin
        //ikinci method isim ve soyismin ilk harfleri büyük harf, kalan harfler * olacak
		//şeklde birleştirsin.
		
		//kullanıcıya isminin açık olarak yazılması veya gizlenmesi tercihini sorun
		//ve programın kalan kısmında isim ve soyismi kullanıcının istedğ şekilde kullanın
		  
		
		Scanner scan=new Scanner (System.in);
		  
		System.out.println("Lütfen isminizi ve soyisminizi giriniz \nisimden sonra enter'a basınız ");
		 
	    String isim=scan.next();
	    String soyİsim=scan.next();
	
	    System.out.println("İsminizin açık bir şekilde yazılmasını istiyorsanız 1,\n "
	    		+ "ilk harf hariç gizli yazılmasını istiyorsanız 2'ye basınız.");
	    
	    int tercih=scan.nextInt();
	    
	    String birleşmişİsim=null; //Kübra Polat , K**** P****
	    
	    if (tercih==1) {
			birleşmişİsim=açıkİsim(isim,soyİsim);
		} else if(tercih==2){
            birleşmişİsim=isimGizle(isim,soyİsim);
		}else {
	       System.out.println("Lütfen 1 veya 2'yi seçin.");
	    
		}
	    
	  
	    System.out.println("Kullanıcının tercihi :" + birleşmişİsim);
	scan.close();
	
	}

	public static String isimGizle(String isim, String soyİsim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
		soyİsim=soyİsim.substring(0,1).toUpperCase() + soyİsim.substring(1).replaceAll("\\w","*");
		
	return isim+" "+soyİsim ;
	}

	public static String açıkİsim(String isim, String soyİsim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();;
		soyİsim=soyİsim.substring(0,1).toUpperCase() + soyİsim.substring(1).toLowerCase();;
		
		return isim+" "+soyİsim;
		
		
	}

}
