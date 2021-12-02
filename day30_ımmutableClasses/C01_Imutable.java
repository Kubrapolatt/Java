package day30_ımmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Imutable {

	public static void main(String[] args) {
		//String immutable bir class iken list mutable'dir


    String str="Ali";
	
    str.toUpperCase();
	
	System.out.println(str);//Ali
	
	System.out.println(str.toUpperCase());//ALİ
	
	
	
	System.out.println(str);//Ali
	
	List < String>isimler=new ArrayList< >();
	
	System.out.println(isimler);//[]
	
	isimler.add("Ali");
	
	System.out.println(isimler);//[Ali]
	
	isimler.set(0, "Veli");
	
	System.out.println(isimler);//[Veli]
	
	isimler.remove(0);
	
	System.out.println(isimler);//[]
	
	
	
	
	}

}
