package day21_Scope_Arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		int sayı=10;
		
		for (int i = 0; i <6; i++) {
			String isim="Kübra";
			System.out.print(sayı+" "+isim);//10 Kübra10 Kübra10 Kübra10 Kübra10 Kübra10 Kübra
		}
              //System.out.println(isim);  
		     //System.out.println(i)   
		 
		    //loop içerisinde oluşturulan variable'lar loop dışında kullanılamazlar
	       //bunun için loop dışında da ihtiyacımız olan bir değişken varsa loop dan önce oluşturur
		  //değer loopdan önce oluşturulur ve emniyette kalmak için intialize yaparız
	
	
	
	for (int i = 0; i <10; i++) {
		//int sayı=20;    //sayı variable'ı main methodu içinde oluşturulduğundan tüm man method'da
		//geçerlidr,dolayısıyla yeniden aynı isimde bir variable oluşturamazsınız
		
		String isim="polat";
	    System.out.print(isim+" ");//polat polat polat polat polat polat polat polat polat polat
	}
	
	
	
	
	
	}

}
