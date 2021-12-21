package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	

	public static void main(String[] args) {

       
		LinkedList <Integer> ll=new LinkedList<>();
		
		System.out.println(ll); //[]
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll); //[5, 7]
		//linkedlist'in 2 adet interface parent'ı vardır.Bunlardan birisi list,diğeri de Deque ==> Queue 
		
		ll.add(0,10);
		
		System.out.println(ll);//[10, 5, 7]   List interface'den gelen özellikle başa eleman ekleme
		
		ll.addFirst(3); //queue interface'den gelen özellikle başa eleman ekler

		System.out.println(ll);//[3, 10, 5, 7]
		
		LinkedList <Integer> ll2=new LinkedList<>();
		
		ll2.addAll(ll);
	     
		System.out.println(ll2);//[3, 10, 5, 7]
		
		ll2.addAll(2,ll);
		
		System.out.println(ll2);//[3, 10, 3, 10, 5, 7, 5, 7]
	
	
	
	
	
	
	
	
	
	
	
	}

}