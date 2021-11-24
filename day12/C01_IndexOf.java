package day12;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin,
		//harfin cumlede var olup olmadigini yazdirin

	Scanner scan=new Scanner(System.in);
	System.out.print("Lütfen bir cümle giriniz :");
	
	
	String cümle=scan.nextLine();
	System.out.print("Lütfen varlığını kontrol etmek için bir harf giriniz :");
	
	char krk=scan.next().charAt(0);
	
	
	int index=cümle.indexOf(krk);//girilen karakterin cümledeki indexini verir
	if (index<0) {
		System.out.print("Girdiğiniz harf verilen cümlede yok.");
	
	}else {
	System.out.print("Girdiğiniz harf verilen cümlede var.");
	}
	
	
	
	
	
	
	
	
	
	
	}

	
}
