package day44_Iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	public static void main(String[] args) {
	
		List <String> liste=new ArrayList<>();
		
		liste.add("Kübra");
		liste.add("Gülseven");
		liste.add("Musab");
		liste.add("Talha");
		liste.add("Orhan");
		
        System.out.println(liste);  // [Kübra, Gülseven, Musab, Talha, Orhan]
		
		ListIterator list1=liste.listIterator();
		String temp="";
		
		while (list1.hasNext()) {
			
			temp=(String) list1.next();
			list1.set(temp+"X");
			//list1.set(list1.next()+"X");
			
			
		}
		
		System.out.println(liste);
		
		
	}

}
