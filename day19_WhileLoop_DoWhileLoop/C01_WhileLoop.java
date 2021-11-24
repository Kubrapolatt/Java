package day19_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi
		//tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
	
	
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Lütfen bölenleri bulmak için pozitif bir tam sayı girin :");
	
	int sayı=scan.nextInt();
	
	int sayaç=0;
	int bölen=1;
	
	
	while (bölen<=sayı) {
		if (sayı%bölen==0) {
			System.out.print(bölen+ " ");
		    sayaç++;
		}
	
	        bölen++;
	
	
	}
	
	    System.out.println(" ");
	   System.out.println(sayı + " sayısının "+ sayaç +" adet tam böleni vardır");
	
	scan.close();
	
	}

}
