package day32_Varargs_StringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		

		KafanaGöreTopla(5,10,13,0);
		
	}

	private static void KafanaGöreTopla(int sayı1,int ...sayılar) {
	int toplam=0;	
	
	for (int each : sayılar) {
		
		toplam+=each;
		}
	
	System.out.println("Girilen sayıların toplamı :" + sayı1*toplam);//115
	
	
		
		
	}

}
