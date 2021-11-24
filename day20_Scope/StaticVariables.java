package day20_Scope;

public class StaticVariables {

	static int no=20;
	static int sayı;
	static String adres="Antalya";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
	public static void main(String[] args) {
		//instance variable'lara static method'dan direk ulaşılablirmi? EVET
	
      System.out.println(no);//20
	  no++;
      System.out.println(no);//21
      staticMethod();
	  System.out.println(no);//22
	 
	  StaticVariables obje=new StaticVariables();
	  obje.staticOlmayanMethod();
	System.out.println(no);//23
	}

public static void staticMethod() {
	//instance variable'lara static method'dan direk ulaşılablirmi? EVET
	no++;
    System.out.println("static method'da sayı : " + no);

}

public void staticOlmayanMethod() {
	//instance variable'lara static method'dan direk ulaşılablirmi? EVET
	//static variable'lara static olan veya olmayan tüm method'lardan  ulaşılabililr.
	//bu yüzden static variable'lara CLASS VARİABLE denir
	
	no++;
	System.out.println("static omayan method : " + no);
		
	
}

}
