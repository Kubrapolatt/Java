package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Fibonacci {

	public static void main(String[] args) {
		// Verilen bir sayıdan küçük fibonacci sayılarını bir list olarak kaydedelim
       //Fibonacci : 1,1,2,3,5,8,13,21,34,55...................
	
	   int sınır=100;
	   
	   List <Integer> fibonacci=new ArrayList<>();
	   
	   fibonacci.add(1);
	   fibonacci.add(1);
	   
	   int sayı=0;
	   
	   while (sayı<sınır) {
		    
		   sayı=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
              
		   fibonacci.add(sayı);
	   }
	
	   
	   
	   System.out.println(fibonacci);  //[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]
	   fibonacci.remove(fibonacci.size()-1);
	   System.out.println(fibonacci);  //[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
	
	
	
	
	
	
	}

}
