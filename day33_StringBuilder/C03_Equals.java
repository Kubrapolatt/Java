package day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Java");
		StringBuilder sb2=new StringBuilder("Java");
	
	    System.out.println(sb1==sb2);//false
	    System.out.println(sb1.equals(sb2));//false
	
	   
	   System.out.println(sb1.compareTo(sb2));//0   
	   //İlk harflerden başlayarak birebir stringbuilder'ları karşılaştırır.
	   //Eğer tüm krakterler aynı ise sonuç olarak 0 döner.
	   //Farklı karakter bulursa ilk yazılan sb,ikinci yazılandan ka char önde onu döndürür
	   
	   //Eğer iki sb'nin eşit olup olmadığını anlamk istersek
	   //if(sb1.compareTo(sb2)==0 ile bakabiliriz
	
	   String str="Java";
	 
	   //System.out.println(sb1==str); ==sb ile string'i karşılaştıramaz
	   System.out.println(sb1.equals(str));//false
	  //System.out.println(sb1.compareTo(str)); compare string için kullanılamaz
	  // System.out.println(sb1=="Java");
	    System.out.println(sb1.equals("Java"));//false
	  //System.out.println(sb1.compareTo("Java"));
	
	
	
	
	
	
	
	
	
	
	
	}

}
