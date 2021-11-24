package day18_nestedForLoop_while_Loop;

public class C05WhileLoop {

	public static void main(String[] args) {
		// Soru 2 ) For loop ve while Loop kullanarak 3 basamakli
		//sayilardan 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.

	for (int i = 100; i <1000; i++) {
		
	if (i%15==0 && i%20==0 && i%90==0) {
		System.out.println(i);
	}
	
}
	
	int sayı=100; //başlangıç değerim
	
	while (sayı<1000) {
		if (sayı%15==0 && sayı%20==0 && sayı%90==0) {
			System.out.println(sayı);
		}
	sayı++;
	}
	
	//eğer başlangıç ve bitiş şartı bir sayının artışına bağlı ise veya tekrar edilecek işlem
	//adedi belli ise forloop tercih edilir.
	//
	
	
	}

}
