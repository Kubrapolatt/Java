package day36_inheritance;

import day35_encapsulation_inheritance.Muhasebe;

public class Memur extends Muhasebe{

	public static void main(String[] args) {
		
		Memur memur1=new Memur();
		
		memur1.isim="Ayşe";
		memur1.saatÜcreti=16;
		memur1.maaş=memur1.maaşHesapla();
		
		System.out.println(memur1.isim+"'nin maaşı : "+memur1.maaş);//Ayşe'nin maaşı : 3200
		
		
		

	}

}
