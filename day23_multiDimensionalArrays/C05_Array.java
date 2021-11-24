package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Array {

	public static void main(String[] args) {
		
  // Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

	
  String cümle="Her şey java ile kolay.";
	
  String kelimeler[]=cümle.split(" ");
	
  System.out.println(Arrays.toString(kelimeler));   //[Her, şey, java, ile, kolay.]
	
  System.out.println("Girilen cümlede " +kelimeler.length+" adet kelime var.");//Girilen cümlede 5 adet kelime var.
	
	
	
	
	
	
	}

}
