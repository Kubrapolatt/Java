package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		
	List <String> harfler=new ArrayList<>();
	
	harfler.add("A");
	harfler.add("Z");
	harfler.add("D");
	harfler.add("F");
	
	System.out.println(harfler); //[A, Z, D, F]
		
	harfler.remove(1);	//Z
	System.out.println(harfler); //[A, D, F]
		
	System.out.println(harfler.remove(2));//F
	System.out.println(harfler);//[A, D]
		
	System.out.println(" ");
	
	System.out.println(harfler.remove("D"));	//true\\
		
	System.out.println(harfler.remove("B"));	//false\\
		
	System.out.println(harfler); //[A]
		
	harfler.add("A");
	harfler.add("Z");
	harfler.add("D");
		
	System.out.println(harfler); //[A, A, Z, D]
		
	System.out.println(harfler.remove("A"));	//true\\
		
	System.out.println(harfler); //[A, Z, D]
		
	harfler.add("A");
	
	System.out.println(harfler);//[A, Z, D, A]
	
	harfler.removeAll(harfler);//removeAll verilen listeyi siler
	
	System.out.println(harfler);//[]
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	harfler.add("A");
	harfler.add("Z");
	harfler.add("D");
	harfler.add("F");
	
	List <String> silinecekHarfler=new ArrayList<>();
	silinecekHarfler.add("A");
	silinecekHarfler.add("C");
	silinecekHarfler.add("F");
	
	System.out.println(harfler);//[A, Z, D, F]
	System.out.println(silinecekHarfler);//[A, C, F]
	
	
	System.out.println(harfler.removeAll(silinecekHarfler)); //true\\
	System.out.println(harfler); //[Z, D]
	System.out.println(silinecekHarfler);//[A, C, F]

	
	//Eğer listemiz int'lardan oluşuyorsa 
	//Java remove(index) ve remove(Object) methodları karışmasın diye girilen sayıyı index olarak kabul eder.
	
	
	
	
	
	
	
	}

}
