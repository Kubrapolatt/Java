package day20_Scope;

public class InstanceVar2 {

	String adres="Ankara";
	String doğumYeri;
	double notOrt;
	double yaşOrt=12.3;
	char cinsiyet='K';
	char krk;
	boolean öğrenciMi=true;
	boolean izinliMi;
	
	public static void main(String[] args) {
	//instance variable'lara main method'dan direk ulaşılablirmi? HAYIR
		//nasıl ulaşılır? obje oluşturarark ulaşılır
		
	InstanceVar2 kübra=new InstanceVar2();
    System.out.println(kübra.adres);  //Ankara
	System.out.println(kübra.doğumYeri); //null
	System.out.println(kübra.notOrt);//0.0
	System.out.println(kübra.yaşOrt);//12.3
	System.out.println(kübra.cinsiyet);//K
	System.out.println(kübra.krk);//space
	System.out.println(kübra.öğrenciMi);//true
	System.out.println(kübra.izinliMi);//false
	
	
	}

  public static void staticMethod() {
	//instance variable'lara static method'dan direk ulaşılablirmi? HAYIR
			//nasıl ulaşılır? OBJE OLUŞURARAK ulaşılır.
	  
	  
  }

public void staticOlmayanMethod() {
	//instance variable'lara static olmayan method'dan direk ulaşılablirmi? EVET
	
	
	
	
	
}


}
