package day35_encapsulation_inheritance;

public class İşçi extends Muhasebe{

	protected String statü;
	protected String meslek;
	protected String sendika;
	
	public İşçi(){
		System.out.println("İşçi parametresiz const. çalıştı.");
	}
	
		public static void main(String[] args) {
	
		
		İşçi işçi1=new İşçi();
		
		işçi1.meslek="Kaynakçı";
		işçi1.saatÜcreti=20;
		işçi1.isim="Kübra";
		işçi1.maaş=işçi1.maaşHesapla();
		
		System.out.println(işçi1.isim+"'nın maaşı : "+işçi1.maaş);

	}

}

	
	
