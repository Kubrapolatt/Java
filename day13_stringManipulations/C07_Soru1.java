package day13_stringManipulations;

public class C07_Soru1 {

	public static void main(String[] args) {
		// Soru 1: String metodlarını kullanarak
		//"  Java ogrenmek123 Cok guzel@ " stringini
		//"Java ogrenmek cok guzel. " şeklinde yazdırınız.
		

	  String cümle="  Java ogrenmek123 Cok guzel@  ";
	  
	  cümle=cümle.substring(2,28); //Java ogrenmek123 Cok guzel
	   
	  System.out.println(cümle);
	  
	  cümle=cümle.replaceAll("\\d", "").replaceAll("C", "c");// ilk olarak : "Java ogrenmek Cok guzel"
	                                                         // sonra da: " Java ogrenmek cok guzel"
      System.out.println(cümle);
	 
	
	 
	 

	  
	  	  
	  
	  
	  
	}

}
