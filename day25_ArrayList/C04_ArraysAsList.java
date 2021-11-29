package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		// Verilen Array'i Arrays class'ından yardım alarak
		//list'e çevirebliriz.

    String arr[]= {"A","b","C" ,"d"};
  
	List<String>arraydenList=Arrays.asList(arr);
	
	System.out.println("List : "+ arraydenList); // List : [A, b, C, d]
	
	//arraydenList.add("F");  //RTE : UnsupportedOperationException
	                       //CTE olması için syntax'da problem olması lazım,ancak bu
	                      //yazımda syntax hatası yok
	
	//bu şekilde  Arrays class'ından yardım alarak array'i list'e çevirirsek
	//oluşturduğumuz list'in boyutu sabit olur
	//dolayısıyla add() veya clear() gibi method'ları çalıştırmak istersek
	//UnsupportedOperationException : Desteklenmeyen işlem verir
	
	
	arr[1]="Z";
	System.out.println("Array'i edğiştirdikten sonra,array = "+Arrays.toString(arr));//Array'i edğiştirdikten sonra,array = [A, Z, C, d]
	
	System.out.println("Array'i edğiştirdikten sonra,list = " +arraydenList); //Array'i edğiştirdikten sonra,list = [A, Z, C, d]
	
	
	arraydenList.set(3, "D");
	System.out.println("List'i edğiştirdikten sonra,list = " +arraydenList);//List'i edğiştirdikten sonra,list = [A, Z, C, D]
	
	System.out.println("List'i edğiştirdikten sonra,array = "+Arrays.toString(arr));//List'i edğiştirdikten sonra,array = [A, Z, C, D]
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
}
