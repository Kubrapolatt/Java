package day35_encapsulation_inheritance;

public class Personel {

	

	protected String isim;
	protected String soyİsim;
	protected String telNo;
	protected boolean çalışıyorMu;
	protected int yaş;
	
	Personel(){
		System.out.println("Personel parametresiz const. çalıştı.");
	}
	
	//eger variable'lara access modifier yazmazsak java access modifier olarak default
	// access modifier atar boyle olursa sadece o package altindaki child classlar
	//Personel clas'ini inherit edebilir
	//baska package'lardaki child claslarin da personeli inherit edebilmesi icin
	//variable ve methodlarin access modifier'larini protected yapariz
	//public yapsak da inherit edilebilir ama biz herkesin erismesini degil
	//sadece child clas'larin erismesini istedigimizden protected tercih ederiz
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		

	}

}
