package day32_Varargs_StringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		
		topla(5,8,10,6,5,4,9);
		//varargs list gibi davranır ama 
		//array methodları ile çalışır
	}

	private static void topla(int ...sayılar) {
	int toplam=0;	
	
	for (int each : sayılar) {
		
		toplam+=each;
		}
	
	System.out.println("Girilen sayıların toplamı :" + toplam);//47
	
	
	}

}
