package day21_Scope_Arrays;

public class C01_LocalVariables {

	String okulİsmi;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// java local variable'lara default değer ataması yapmaz
		//kodlarımızda sorun yaşamamak için oluşturduğumuz local
		//variabe'lara uygun bir değer atamamaızda fayda var

	
	int sayı=0;//int sayı; dersek java CTE verir
	System.out.println(sayı);
	
	//int sayı;//bir localde aynı isimde birden fazla variable OLUŞTURULMAZ
	// String sayı; //data türü farklı olsa da java buna izin vermez
	
	
	String isim="Kübra";
	
	}

	public static void staticMethod() {
		
		//sayı;  // bir lokalde oluşturulam variable (method'ların static olup olmamasına
		         //bağlı olmazksızın)farklı lokalde kullanılamaz.
	
	@SuppressWarnings("unused")
	String isim="Polat"	;
		
	}
	
	
	
	
	
	
	
}
