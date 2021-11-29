package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
	
		// Bazen index ile hi uğraşmadan bir array veya listedeki tüm elemanları gözden geçirmek isteriz.
	   
		int arr[]= {1,2,3,5,3,2,7};
		
		//bu array'i esnek bir list yapmak istiyorum
		
		 List<Integer>yeniList=new ArrayList<>();
		
		/*for (int i = 0; i < arr.length; i++) {
			
		 yeniList.add(arr[i]);
			
			}
		
		System.out.println(yeniList);*/
		
		for (int each : arr) { //arr'deki each(her bir) int'ı bana getir
			
			yeniList.add(each);
			
		}
		
		
		System.out.println(yeniList); //[1, 2, 3, 5, 3, 2, 7]
		
		
		
		 //Eğer bir list veya array2in tüm elemanları elden geçirmek istiyorsak
		//ve sıralama onemli değlse for-each kullanırız
		
		
		
		
		
		
		
		
		
		

	}

}
