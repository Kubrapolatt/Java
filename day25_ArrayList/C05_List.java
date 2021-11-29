package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		
	 //Verilen bir listede içinde belirli bi harf olan elemanları
	//silen bir method yazınınz.

    List<String>str=new ArrayList<>();
    
    str.add("Jeyhun");
    str.add("Yıldız");
    str.add("Mustafa");
    str.add("Tuğba");
    str.add("Turgat");
	
	System.out.println(str);//[Jeyhun, Yıldız, Mustafa, Tuğba, Turgat]

	String silinecekHarf="a";
	
	killThemAll(str,silinecekHarf);
	
	
}

	public static List<String> killThemAll(List<String> str, String silinecekHarf) {
		
		for (int i = 0; i <str.size(); i++) {
			
			if (str.get(i).contains(silinecekHarf)) {
				
				str.remove(i);
			
				  i--;
			}
		}
		
	System.out.println(str);//[Jeyhun, Yıldız]
	return str;
	}

}
