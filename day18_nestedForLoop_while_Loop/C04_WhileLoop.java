package day18_nestedForLoop_while_Loop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		//kullanıcıdan toplanmak üzere  sayı isteyin kullanıcı
		//0 a basıncaya kadar sayıları alıp toplamaya devam edin.
		//kullanıcı 0 a bastığında , o ana kadar kaç sayı girdiğini ve girilen
		//sayıların toplamını yazdırın.

	
	//kullanıcıdan 5 sayı al denilirse
		
		for (int i = 1; i <=5; i++) {
			//kullanıcıdan bir değer alıp ,toplama eklerim
		}
		
		Scanner scan=new Scanner (System.in);

	    //loopun içinde kullanacağı obje ve variable ları looptan 
		//önce oluşturmak daha güzeldir çünkü loopun iinde oluşturursak
		//loop her döndüğünde yeni bir obje veya variable oluşturur
		//ve bu da hafızayı doldurur
	
	    int sayı=1;
	    int toplam=0;
	    int sayaç=0;
	
	//scan.close();
	
	while (sayı!=0) {
		
		System.out.println("Lütfen toplama eklemek için bir tam sayı yazın \nbitirmek için 0'a basın.");
	    sayı=scan.nextInt();
	    toplam+=sayı;
	    sayaç++;
	
	}
	
	//kullanıcı 0 a bastığında loop işlevini son kez yapıp sonra baa dönecek ve loop bitecek.
	//0 toplanmak üzere verilmeyip sadece bitirmek için verildiğinden 
	//0 ı sayaça eklememek için 45.satırda sayaç -1 yaptık
	
	System.out.println("Girilen sayı adedi :" + (sayaç-1));
	System.out.println("Girilen sayıların toplamı :" + toplam);
	
	
	scan.close();
	
	
	}

}
