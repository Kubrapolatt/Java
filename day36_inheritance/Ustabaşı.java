package day36_inheritance;

import day35_encapsulation_inheritance.İşçi;

public class Ustabaşı extends İşçi {

	Ustabaşı(){
		System.out.println("Ustabaşı parametresiz const. çalıştı.");
	}
	
	public static void main(String[] args) {

		Ustabaşı ust1=new Ustabaşı();
		
		//Java'da her class oluşturulduğunda otomatik olarak
		//default const. oluşturulduğu GİBİ childclass'da
		//oluşturulan her bir const'ın ilk satırında
		//super() const'ı oluşturur.
		
		

	}

}
