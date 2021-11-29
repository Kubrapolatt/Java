package day27_Constructor_ConstructorCall;

public class TırRunner {
  
	 public static void main(String[] args) {
		
	  //Br tane tüm özellikleri değiştiren const. oluşturalım.
	 
	 
	  Tır tır1=new Tır(5000,"volvo","beyaz",2020,false);
	               //int km , String model, String renk, boolen satılıkMı ,int yıl
	 
	  System.out.println(tır1.km+" "+tır1.model+" "+tır1.renk+" "+tır1.yıl+" "+tır1.satılıkMı+" ");//5000 volvo beyaz 2020 false 

	 
	  
	  //Üç özelliği değiştiren  bir const. oluşturalım
	  //int km , String model, String renk
	 
	 
	 Tır tır2=new Tır(12000,"axor","Beyaz");
	 
	 System.out.println(tır2.km+" "+tır2.model+" "+tır2.renk+" "+tır2.yıl+" "+tır2.satılıkMı+" ");
	 
	 
	 
	 
	 
	 }
}
