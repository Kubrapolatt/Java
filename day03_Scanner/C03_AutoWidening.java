package day03_Scanner;

public class C03_AutoWidening {

	public static void main(String[] args) {
	
	byte sayi1=44;
	
	short sayi2=sayi1;
	//eşitliğin sol tarafı short sağ tarafı byte
	//iki data türü farklı olduğu halde java itiraz etmiiyor
	//çünkü atama yapıla variable ın data türü(short)atanan değerin veri türünden (byte)büyük olduğu için sorun oluşmaz
	
	
	
	
	System.out.println("sayi2 :" +sayi2);
	
	int sayi3=25;
	
	double sayi4=sayi3;
	
	System.out.println("sayi4 :" +sayi4);
			
	//bu işlem auto widening denir	
		
		

	}

}
