package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExceptions {

	public static void main(String[] args) {


		try {
			FileInputStream fis=new FileInputStream("src/day40/yazı.text");
			 int k=0;
			    while((k=fis.read())!=-1) {
			        System.out.print((char)k);
			        
			    }
			 
			        System.out.println("Dosya Silinmiş veya ulaşılamıyor");
			    
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println("Görev Tamamlandı");
		
		
		
		
		
		
		

	}

}
