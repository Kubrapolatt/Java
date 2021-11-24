package day04_IncrementDecrement;

import java.util.Scanner;

public class OdevSorusu3 {

	public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);

    System.out.println("Çemberin yarıçapını giriniz");
	
  
	double yarıçap= scan.nextDouble();
	
	double çevre=2*3.14*yarıçap;
	 
	double alan=3.14*yarıçap*yarıçap;		
			
			
	System.out.println("Çemberin çevresi : " + çevre );

	System.out.println("Dairenin alanı : " + alan);
	
	}

}
