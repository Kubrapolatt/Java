package day37_Inheritance;

public class Corolla extends Toyota{

	
	String renk;
	int fiyat;
	boolean elektriklMi;
	int tekerSayısı=4;
	String üretimyeri="Türkiye";
	
	public static void main(String[] args) {
		
		
		 Corolla                 araba1           =            new             Corolla();
 //Class ismi && data türü    //obje ismi    //assigment    //keyword       //Constructor
		
		
		//Java'da obje oluşturduğumuz her class ismi aynı zamanda bir data türüdür.
		//Bu örnek için corolla hem class adı hem de oluşturduğumuz araba1 objesinin data type'ıdır.
		 //Java'da obje üretilen her bir class non-primitive data türü olur
		
		 
		System.out.println(araba1.calışıyoMu);   //true
		System.out.println(araba1.tekerSayısı); //4
		System.out.println(araba1.üretimyeri); //Türkiye
		
		Toyota araba2 = new Corolla();
		
		System.out.println(araba1.calışıyoMu); //true
		System.out.println(araba2.tekerSayısı);//0
		
		Araba araba3 = new Corolla();

	
	
	
	
	}

}

	
	
	