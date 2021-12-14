package day40;

public class C01_Exception {

	public static void main(String[] args) {

 int a=20;
 int b=0;
 

    try {
		 System.out.println("Sayıların bölümü : "+a/b);
		
	} catch (ArithmeticException e) {
	     System.out.println("0'a bölüm yapılamaz.");
	     //System.out.println(e.getMessage());//       / by zero    exception'ın kaynagını gösterdi
	     e.printStackTrace();/*  java.lang.ArithmeticException: / by zero
	 	at day40.C01_Exception.main(C01_Exception.java:12)  */ 
		
	}
	
	System.out.println("Görev Tamamlandı");
	
	
	
	
	
	
	
	
	}

}
