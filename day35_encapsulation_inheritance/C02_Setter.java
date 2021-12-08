package day35_encapsulation_inheritance;

public class C02_Setter {

	public static void main(String[] args) {
		
		
		//Öğretmenler öğrencinin notunu girebilsin ama tüm notları
		//göremesin sadece geçip geçemediğini görsün
		
		
		C01 öğrenci1=new C01();
	
		System.out.println(öğrenci1.isGeçerMi());// default olarak 49.9 atadığımız için false döndürür
	
		öğrenci1.setNot(90.5);
		
		//System.out.println(öğrenci1.setNot(90.5));  setter olduğu için değiştirebilirz ama yazdırıp göremeyiz
		System.out.println(öğrenci1.isGeçerMi()); //true          *geçtiğini bu şekilde görebiliriz*
		
		
	}

}
