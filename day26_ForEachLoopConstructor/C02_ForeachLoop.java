package day26_ForEachLoopConstructor;

public class C02_ForeachLoop {

	public static void main(String[] args) {
		// Bir integer array olusturunuz ve bu array’deki 
		//tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz

	
	int arr[]= {3,4,2,5};
	
	int çarpım=1;
	
	for (int each : arr) {
		
		çarpım*=each;
		
		}
	
	System.out.println("Array'in elemanları çarpımı : "+ çarpım);
	
	
	
	
	
	
	
	
	}

}
