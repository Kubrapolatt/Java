package day44_Iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

        List<Integer>liste=new ArrayList<>();
		
	    liste.add(5);
	    liste.add(3);
	    liste.add(7);
	    liste.add(1);
	    liste.add(9);
	    liste.add(8);
	    liste.add(2);
	
	    System.out.println(liste);
		
		Iterator ite1=liste.iterator();  //[5, 3, 7, 1, 9, 8, 2]
		
		ite1.next();
		ite1.next();
		ite1.next();
		
		System.out.println(ite1.next());  //1
		
		ite1.remove();
	
		//System.out.println(ite1.remove());
		
		
		System.out.println(liste);//1 silindi =>  [5, 3, 7, 9, 8, 2]
		
	}

}
