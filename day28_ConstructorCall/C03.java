package day28_ConstructorCall;

public class C03 {

	public static void main(String[] args) {
		
		  //Java runtime bir programdır.Run tuşuna bastığımımzda java alışmaya başlar 
		 //ve işlemleri yapar.Javanın işi bittiğinde (çonsole kırmızıdan griye döndüğünde)
		//her şey başa döner.
		
	     //static variable ve method'lar bulundukları class ileilintilidir.(objeyle değil class ile)
		//başka bir class'da iken C02'deki static variable veya method'a ulaşmka istediğimizde
	   //C02.staticVariableIsmi ve C02.statcMethodIsmı() yazmamız yeterli olur.
		
		
		C02 obje1=new C02();
		
		System.out.println("obje1 için x :"+ obje1.x +" "+"obje1 için y : "+ C02.y);//obje1 için x :5 obje1 için y : 10
		
		obje1.x++;
		C02.y++;
		
		//static bir variable'a class ismi üzerinden ulaşmak yerine instance variable'lar gibi
		//obje ile ulaşmaya çalışırsanız java CTE vermez ama solda ünlem işareti ile bizi uyarır.
		//static bir field olan C02.y'ye static bir yoldan ulaş der
		
		System.out.println("arttırmadan sonra obje1 x :"+ obje1.x +" "+"arttırmadan sonra obje1 y : "+ C02.y);//arttırmadan sonra obje1 x :6 arttırmadan sonra obje1 y : 11
		
		System.out.println("----------------------------------------");
		
		C02 obje2=new C02();
		
		System.out.println("obje2 için x :"+ obje2.x +" "+"obje2 için y : "+ C02.y);//obje2 için x :5 obje2 için y : 11
		
		obje2.x++;
		C02.y++;
		
		System.out.println("arttırmadan sonra obje2 x :"+ obje2.x +" "+"arttırmadan sonra obje2 y : "+ C02.y);//arttırmadan sonra obje2 x :6 arttırmadan sonra obje2 y : 12
		
		System.out.println("Obje2 oluşturulduktan ve arttırmadan sonra obje1'in" 
				+ "\nx'i :"+obje1.x+"  "+"y'si :"+C02.y);//Obje2 oluşturulduktan ve arttırmadan sonra obje1'in x'i :6  y'si :12
		
		System.out.println("----------------------------------------");
		
		C02 obje3=new C02();
		
		obje3.x=20;
		C02.y=40;
		
		System.out.println("obje3'den sonra obje1'in x'i : " +obje1.x);//6
		System.out.println("obje3'den sonra obje2'in x'i : " +obje2.x);//6
		System.out.println("obje3'den sonra obje3'in x'i : " +obje3.x);//20
	
		System.out.println("---------------------------------");
		
		System.out.println("obje3'den sonra obje1'in y'si : " +C02.y);//40
		System.out.println("obje3'den sonra obje2'in y'si : " +C02.y);//40
		System.out.println("obje3'den sonra obje3'in y'si : " +C02.y);//40
	
	
	
	}

}
