package Questions;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		//Girilen bir String'i tersten yazdiran bir pr create ediniz

	Scanner scan=new Scanner(System.in);
	
	System.out.print("Tersten yazdırmak için bir metin giriniz : ");
	String metin=scan.nextLine();
	
	String ters="";
	
	for (int i = metin.length()-1; i >=0; i--) {
	
		ters=ters+metin.charAt(i);
		
	}
	
	System.out.println("Girdiğiniz metnin tersi : " +ters);
	
	}

}
