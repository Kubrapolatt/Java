package day31_DateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// Verilen sayıları toplayan bir metho oluşturmak istiyorum
		
		
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		
		topla(a,b);//2 sayının toplamı : 30
		topla(a,b,c);//3 sayının toplamı : 60
		topla(a,b,c,d);//Varargs çalışır
		topla(a,b,c,d,e);//Varargs çalışır
		topla(a,b,c,d,e,f);//Varargs çalışır
		
		//Şu ana kadar gördüğümüz tekniklerle değişken sayıda parametreli tek bir method oluşturamayız
	   //variaty(çeşitlilik)  arguments 
	
	}

    public static void topla(int...a) {
     System.out.println("Varargs çalışır ");
		
	}

	public static void topla(int a, int b, int c) {
    	System.out.println("3 sayının toplamı : "+(a+b+c));
		
	}

	public static void topla(int a, int b) {
        System.out.println("2 sayının toplamı : "+(a+b));
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
