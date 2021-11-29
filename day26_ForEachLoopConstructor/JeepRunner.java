package day26_ForEachLoopConstructor;

public class JeepRunner {

	public static void main(String[] args) {
		// Jeep class'ında bir obje oluşturalım ve özelliklerini yazdıralım.
		

	Jeep jeep1=new Jeep();
	
	System.out.println(jeep1.fiyat+" "+jeep1.ilanNo+" "+jeep1.marka+" "+jeep1.model+" "+jeep1.yıl+" "); //100000 - 1001 - null - null - 2000 
	
	//jjeep class'ındaki variable'lar instance varable'lar olduklarından
	//atadığım değerler sadece benim objem için değerleri değiştirir
	//jeep class'ındaki değerlere hç bir şey yapmaz
	
	jeep1.fiyat=15000;
    jeep1.ilanNo=1002;
	jeep1.marka="Toyota";
	jeep1.model="corolla";
	jeep1.yıl=2005;
	
	System.out.println(jeep1.fiyat+" "+jeep1.ilanNo+" "+jeep1.marka+" "+jeep1.model+" "+jeep1.yıl+" ");//15000 - 1002 - Toyota - Corolla - 2005
	
	jeep1.hız(150); //Araba saatte 150 km yapar.
	
	jeep1.yakıt("benzin"); //Araba yakıt olarak benzin kulanır.
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
}
