package day38_overriding;

public class KümesHayvanları extends Kuşlar{

	public static void main(String[] args) {
		
    KümesHayvanları kms1=new KümesHayvanları();
	
    kms1.beslenme();//Tüm hayvanlar beslenir
	kms1.hareket();//Kümes hayvanları yürüyerek hareket eder
	kms1.solunum();//Kuşlar akciğerleriyle solunum yaparlar
		
	    
	System.out.println("-----------------------------------------------");
	
	Kuşlar kms2=new KümesHayvanları();
	
	kms2.beslenme();//Animals : Tüm hayvanlar beslenir
	kms2.hareket();// Kuşlar : Kümes hayvanları yürüyerek hareket eder
	kms2.solunum();//Kuşlar : Kuşlar akciğerleriyle solunum yaparlar
	
	//kendi spesifik özellikleri dışında kuşlara tabi olur
	//ama spesifik bir durumu varsa farkını ortaya koyar
	
	System.out.println("------------------------------------------------");
	
    Kuşlar kms3=new Kuşlar();
   
    kms3.beslenme();//Tüm hayvanlar beslenir
	kms3.hareket();//Kuşlar uçarak hareket eder
	kms3.solunum();//Kuşlar akciğerleriyle solunum yaparlar
	
	System.out.println("------------------------------------------------");
	
	Animals kms4=new KümesHayvanları();
	kms4.beslenme();// Animals : Tüm hayvanlar beslenir
	kms4.hareket();// Animals : Kümes hayvanları yürüyerek hareket eder
	kms4.solunum();//Animals : Kuşlar akciğerleriyle solunum yaparlar
	
	
	}

	public void hareket() {
		System.out.println("Kümes hayvanları yürüyerek hareket eder");
	}
	
	
	
	
}
