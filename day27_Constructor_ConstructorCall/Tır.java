package day27_Constructor_ConstructorCall;

public class Tır {
  
	
	
		  boolean satılıkMı;
		  int yıl=2000;
		  int km;
		  String renk;
		  String model;


		  public Tır(int i, String string, String string2, int j, boolean b) {
				// Tır runner class'ından yolladığımız değerlerin nsttance variable'lar ile eşleşmesi 
			  //için atamalar yapmam lazım
			
		  
		  km=i;
		  model=string;
		  renk=string2;
		  yıl=j;
		  satılıkMı=b;
		  
		  
		  }


		public Tır(int km, String model, String renk) {
			// i,string ve string2 isim olarak güzel isimler değil 
			//kodumuzu sonradan incelerken anlaşılır değil
			//daha anlaşılır oması için variable isimlerini
			//anlamlı yapalım.
			//  //int km , String model, String renk
	
		this.km=km;
		this.model=model;
		this.renk=renk;
		
		
		
		
		}


















}



