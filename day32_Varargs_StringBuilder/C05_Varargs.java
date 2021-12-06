package day32_Varargs_StringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		topla(5,8,10);
		
		//varargs'dan önce farklı parametreler kullanabilir
		//ama varargs'dan sonra parametre yazılamaz
		//yazarsanız java varargs son parametre olmalıdır diye uyarır ve CTE verir
	}

	private static void topla(int ...sayılar) {
	int toplam=0;	
	
	for (int each : sayılar) {
		
		toplam+=each;
		}
	
	System.out.println("Girilen sayıların toplamı :" + toplam);//23
	
	
	
	
	
	
	
	
	}

}
