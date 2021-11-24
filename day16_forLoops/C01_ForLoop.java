package day16_forLoops;


import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;



public class C01_ForLoop {

	public static void main(String[] args) {
		
 /* for (int i = 0; i <= 10; i++) {
	System.out.print(i+" ");

	
          }
	

	//forLoop başlangıç ve bitiş şartı bir sayının değerine bağlı olan
  //durumlarda tercih edilir
	
	/*for (int i = 0; i < 10; i--) {
		System.out.println(i+" ");*/
	
	
	//eğer başlangıç sayısı artış/azalış ile bitiş edğerine yaklaşmıyor,uzaklaşıyor
	//ise loop hiç bir zaman durmaz
	//bu duruma  sonsuz loop deriz ve bu durumun gerçekleşmesini istemeyiz
	
	
	for (int i = 0; i > 10; i++) {
		System.out.println(i+"acaba alışır mı?");
	}
	
	
	 // eger ilk deger icin bitis sarti true olmazsa
    // daha ilk adimda loop broken olur
    // dolayisiyla loop body hic calismadan, loop'un sonrasina gecilir
    // loop CALISIR, ama hic bir islem YAPMAZ
	
	}
	
	
}	
	
	
	
	
	


