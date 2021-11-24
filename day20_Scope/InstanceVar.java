package day20_Scope;

public class InstanceVar {


	int notMat=50;
	int notFen;
	//instance variable'ların scope'unda main method yoktur.
	
	public static void main(String[] args) {
		
	//System.out.println(notMat);   //main method static olduğu için static olmayan variable'lar
		                           //main method da direk kulanılamaz veya görüntülenemez.
                                  
	//insatnce variable'lara ulaşmak istersek obje oluşturup obje üzerinden erişim sağlayabiliriz.
	//içinde olduğumuz class dan bir obje oluşturalım
	
	InstanceVar kübra=new InstanceVar();
	System.out.println(kübra.notMat);    // Output:50
	
	InstanceVar polat=new InstanceVar();
	polat.notMat=70;
	
	System.out.println(polat.notMat);   //Output:70
	//instance variable'larda değer atamazsak java instance olarak atanan değeri alır
	//b class için notMat=50 gibi
	//ama istersek değer de atayabilirz bu durumda değer atadığımız obje için yenni edğer geçerli olur
	
	System.out.println(kübra.notMat);  //Output:50
	//kübranın notunu değiştirmek istiyorsak kübra.notMat'a değer atamalıyız
	
	kübra.notMat=90;
	
	System.out.println(kübra.notMat);  //Output:90
	
	kübra.method2();//method2 static olmadığı iin main method'dan direk çağırılamaz
	}

   public static void staticMethod() {
	  
//	System.out.println(notFen);    //instance variable'lara static method'lardan direk ulaşılamaz.
	   
	   
	 }

 
   public void method2() {
	   System.out.println("method2 deki notFen" + notFen);  //bu method static olmadığı için instance variable'lara direk ulaşabilir
   //instance variable oluşturulurken değer atanmasa da olur bu durumda java default değeerler atar
   //int için default değer 0'dır.
   notFen=100;
   System.out.println("method2 deki düzeltilmiş notFen" + notFen);
   }
   
}
