package day40;

import java.util.Scanner;

public class C08_IllegalArgumentsException {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen konsolda görmek için yaşını giriniz : ");
		int yaş=scan.nextInt();
		
		try {
			if (yaş<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println("Yaşınız : "+yaş);
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yaş 0'dan küçük olamaz");
		}
		
		
		
		
		
		
		
		
	}
}
