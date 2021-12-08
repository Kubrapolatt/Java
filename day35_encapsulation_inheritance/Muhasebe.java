package day35_encapsulation_inheritance;

public class Muhasebe extends Personel {


	protected int saatÜcreti;
	protected int maaş;
	protected String statü;
	
	public static void main(String[] args) {
		
		Muhasebe çalışan1=new Muhasebe();
		
		çalışan1.isim="Kübra";
		System.out.println(çalışan1.isim);//Kübra

	}

	public int maaşHesapla() {
		
		int maaş=8*25*saatÜcreti;
		return maaş;
		
		
		
	}
}
