package day10_Ternary_SwitchCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// string olarak verilen bir değişkeni 
		//+ ile başka bir değişkenle işleme
		//sokarsa java bunları yan yana ekler
		//buna CONCATENATİON denir
		
		
		String isim="ALİ";
		String soyİsim="CAN";

		System.out.println(isim+" "+soyİsim);
		// aynı işlemi + sembolü yerine
		//concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyİsim));
		
		System.out.println(isim.concat(" ").concat(soyİsim));
		
		
		
	}

}
