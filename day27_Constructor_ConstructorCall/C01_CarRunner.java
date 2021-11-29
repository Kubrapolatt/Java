package day27_Constructor_ConstructorCall;

public class C01_CarRunner {

	public static void main(String[] args) {
	
	     //Dün ki car class'ından bir obje oluşturmak istediğimizde 
		//java car class'ını içinde bulunduğumuz class'a import etmek ister
		
		Car1 car=new Car1();
		
		System.out.println(car.yıl);
		
		//Ancak başka package'da olduğu için içinde olduğumuz class'dan car clas'ındaki
		//variable'lara ulaşabilmem için varaile'ların acsess modifier'ı public olmalıdır.
		
		
		Car1 car1=new Car1();
		
		 System.out.println(car1.km+" "+car1.model+" "+car1.renk+" "+car1.yıl+" "+car1.satılıkMı+" ");

	   car1.km=7500;
	   car1.model="Corolla";
	   car1.renk="Kırmızı";
	 
	   System.out.println(car1.km+" "+car1.model+" "+car1.renk+" "+car1.yıl+" "+car1.satılıkMı+" ");//7500 Corolla Kırmızı 2000 false 
	
       Car1 car2=new Car1();
	
      System.out.println(car2.km+" "+car2.model+" "+car2.renk+" "+car2.yıl+" "+car2.satılıkMı+" ");//0 null null 2000 false 
	
	
	  Car1 car3=new Car1();
      
	   car3.km=40000;
	   car3.model="BMW";
	   
      
	   System.out.println(car3.km+" "+car3.model+" "+car3.renk+" "+car3.yıl+" "+car3.satılıkMı+" ");//40000 BMW null 2000 false 
	
	}

}
