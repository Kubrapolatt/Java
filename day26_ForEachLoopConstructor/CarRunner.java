package day26_ForEachLoopConstructor;

public class CarRunner {

	public static void main(String[] args) {
		// Car class'ından bir obje oluşturalım.
		
		
		 Car            car1                =            new                 Car();
//     Class ism       obje ismi          atama         keyword          Constructor call
		
		
		 System.out.println(car1.km+" "+car1.model+" "+car1.renk+" "+car1.yıl+" "); //0 - null - null - 2000
	
	
	   //bir obje oluştururken eğer obje için kendi class'ında belirlenen değerleri kullanmak
	  //istiyorsam hiç bir değeri kendim atamadan obje oluşturabilirim
	  //bu durumda hiç bir parametre kullanılmadığı için default const. yeterli olacaktır
	
	
	  //Eğer oluşturduğum class'daki değerleri kullanmak yerine kendi değerlerimle
      //bir obje oluşurmak istersem o zaman parametreli const. oluşturmak gerekir.
		
	 //	 Car car2= new Car("Kırmızı","Mini Cooper");
	
	
	//Car class'ında iki string parametresi olan bir const. olmadığı için bu obje oluşturmayı şimdilik yapamayız
	
	
	
	
	
	}

}
