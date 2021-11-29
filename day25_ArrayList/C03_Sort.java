package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		
		
		List<String>isimler=new ArrayList<>();
		
        isimler.add("Kübra");
        isimler.add("Elif");
        isimler.add("Yasemin");
	
	    System.out.println(isimler); //[Kübra, Elif, Yasemin]
	 
	    Collections.sort(isimler);
	    System.out.println(isimler); //[Elif, Kübra, Yasemin]   ***natural order***
	
	   isimler.add("gülseven");
	   System.out.println(isimler); //[Elif, Kübra, Yasemin, gülseven]
	
	   Collections.sort(isimler);
	
	   System.out.println(isimler); //[Elif, Kübra, Yasemin, gülseven]
	
	
	
	
	
	
	
	
	
	}

}
