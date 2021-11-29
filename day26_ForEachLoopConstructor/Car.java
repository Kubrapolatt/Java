package day26_ForEachLoopConstructor;

public class Car {
      
	  // Java biz bir class oluşturduğumuzda,o class'dan obje üreteceğini bilir
	 //ve her class'a default bir constructar yerleştirir
	//Java'nın class'a koyduğu bir default constructor görülmez
   //ama obje üretmek üzere kod yazdığımızda otomatik olarak devreye girer
 
	      //bir constructor oluşturmak çok kolaydır.
	     //methoda benzer ama method'dan farklıdır
        //1.Kural:Constructor ismi class ismi ile aynı olmalıdır
       //class isimleri büyük harfle başladığı için Constructor ismi de büyük harfle başlar
	  //(method'dan 1.farkı budur,method'lar küük harfle bşlar.)
	 //Const.'ın return type'ı olmaz.(method'dan 2.farkı budur.methodlar'ın return type'ı olmalıdır.)
	
	
    Car() {
		
	}
	
	//Java'nın her class'da oluşturduğu const. budur.
	
  boolean satılıkMı;
  int yıl=2000;
  int km;
  String renk;
  String model;
 
  //Bugün itibari ile main method olma mecburiyeti kaldırılmıştır :)
  //Ancak bildiğimiz gibi main method olmayan bir class direk çalıştırlamaz
  //main methodu olmayan class'lar başka class'lardan obje oluşturularak kullanılmak üzere
  //ihtiyaç duyulan variable ve memthod'ları sakladığımız bir depo gibidir.












}
