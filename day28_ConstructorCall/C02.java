package day28_ConstructorCall;

public class C02 {

	int x=5;
	static int y=10;
	
	
	public static void main(String[] args) {
		
    //3 tane obje oluşturalım ve değişimleri gözlemleyelim
	
	C02 obje1=new C02();
	
	System.out.println("obje1 için x :"+ obje1.x +" "+"obje1 için y : "+ y);//obje1 için x :5 obje1 için y : 10
	
	obje1.x++;
	y++;
	
	System.out.println("arttırmadan sonra obje1 x :"+ obje1.x +" "+"arttırmadan sonra obje1 y : "+ y);//arttırmadan sonra obje1 x :6 arttırmadan sonra obje1 y : 11
	
	System.out.println("----------------------------------------");
	
	//aynı class içinde iken static variable'lara ulaşmak için objeye ihtiyaç duyar
	//kulanırsak Java CTE vermez ama "statc variable'a static yoldan ulaş." diye bizi uyarır.
	C02 obje2=new C02();
	
	System.out.println("obje2 için x :"+ obje2.x +" "+"obje2 için y : "+ y);//obje2 için x :5 obje2 için y : 11
	
	obje2.x++;
	y++;
	
	System.out.println("arttırmadan sonra obje2 x :"+ obje2.x +" "+"arttırmadan sonra obje2 y : "+ y);//arttırmadan sonra obje2 x :6 arttırmadan sonra obje2 y : 12
	
	System.out.println("Obje2 oluşturulduktan ve arttırmadan sonra obje1'in" 
			+ "\nx'i :"+obje1.x+"  "+"y'si :"+y);//Obje2 oluşturulduktan ve arttırmadan sonra obje1'in x'i :6  y'si :12
	
	System.out.println("----------------------------------------");
	
	C02 obje3=new C02();
	
	obje3.x=20;
	y=40;
	
	System.out.println("obje3'den sonra obje1'in x'i : " +obje1.x);//6
	System.out.println("obje3'den sonra obje2'in x'i : " +obje2.x);//6
	System.out.println("obje3'den sonra obje3'in x'i : " +obje3.x);//20
	
	System.out.println("----------------------------------------");
	
	System.out.println("obje3'den sonra obje1'in y'si : " +y);//40
	System.out.println("obje3'den sonra obje2'in y'si : " +y);//40
	System.out.println("obje3'den sonra obje3'in y'si : " +y);//40
	
	
	
	
	}

	
}
	
	
	
