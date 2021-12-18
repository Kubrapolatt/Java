package day44_Iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Integer>liste=new ArrayList<>();
		
	    liste.add(5);
	    liste.add(4);
	    liste.add(9);
	    liste.add(7);
	    liste.add(3);
	    liste.add(1);
	
	   System.out.println(liste); // [5   ,    4   ,    9   ,   7   ,    3   ,    1]
		
	   

		Iterator ite1=liste.iterator();
		
		for (int i = 0; i < liste.size(); i++) {
			
			System.out.println(ite1.hasNext()+" ===== "+ite1.next());
	      /*  true ===== 5
              true ===== 4
              true ===== 9
              true ===== 7
              true ===== 3
              true ===== 1 */
		}
		
		
		System.out.println(ite1.hasNext());//false
		System.out.println(ite1.next());//java.util.NoSuchElementException

		

	}

}
