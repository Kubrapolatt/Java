package day27_Constructor_ConstructorCall;

public class Car1 {

	
	  boolean satılıkMı;
	  int yıl=2000;
	  int km;
	  String renk;
	  String model;
	 
	

	  public Car1(int km, String model, String renk, boolean satılıkMı, int yıl) {
		//Atama yapacağımız tüm özellikleri parametre olarak yolladık.
	}

	  public Car1(){
		  
	  }
	  
	public Car1(int i) {//bu satırda int km ile class level'daki int km farklı scope'lardır.
		km=i;
	}

	public void hız(int hız) {
		 System.out.println("Araba saatte " + hız +" "+"km yapar.");
	 }

	 public void yakıt(String yakıt) {
		System.out.println("Araba yakıt olarak " + yakıt +" "+"kulanır.");
	 }
	
	
	
	
	
	
	
}
