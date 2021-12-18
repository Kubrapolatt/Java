package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {

		List <Integer> ll=new LinkedList<>();
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);//[5, 7]
		
		ll.add(9);//data türünü list seçtiğimiz için sadece list interface'indeki methodları kullanabiliriz
		         //linkedlist class'ında override ettiğimiz için 
		        //interface olmasına ragmen nasıl List methodlarını kullanabildik
		        
		
		Queue <Integer> ll2=new LinkedList<>();
		
		ll2.add(5);
		ll2.add(7);
		ll2.clear(); //Data türü Queu seçilince queu interface'inden gelen method'ları kullanabildik
		
		
       Deque <Integer> ll3=new LinkedList<>();
		
		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20);//
		
		
		
		
		
		
		
		
		

	}

}
