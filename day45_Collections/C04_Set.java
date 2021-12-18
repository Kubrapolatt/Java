package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Set {

	public static void main(String[] args) {

      Set<Object>s1=new HashSet<>();
		
	  s1.add(4);
	  s1.add(7);
	  s1.add(19);
		
	  System.out.println(s1); //[19, 4, 7]
		
	  s1.add("Java Candır");
		
	  System.out.println(s1);//[Java Candır, 19, 4, 7]
		
	  List<Object>liste=new ArrayList<>();
	  
	liste.add(5);
	  liste.add("Java Süper");
	  liste.add('k');
	  liste.add(true);
	  liste.add(s1);
	  
     System.out.println(liste);
	
	
	
	
	}

}
