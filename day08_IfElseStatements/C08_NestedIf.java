package day08_IfElseStatements;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen cinsiyetinizi giriniz \nErkek için E Kadın için K");
	    char cinsiyet =scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen yaşınızı giriniz");
		double yaş=scan.nextDouble();
		
		if (cinsiyet=='E') {
			
		   if (yaş >=65) {
			System.out.println("Emekli olabilirsiniz");
		} else {
			System.out.println("Emekli olamazsın");
		}
		
		
		} else if(cinsiyet=='K') {

			if (yaş>=60) {
				System.out.println("Emekli olabilirsiniz");
			} else {
				System.out.println("Emekli olamazsın");
			}
			
		}  else {
			System.out.println("Lütfen cinsiyet için geçerli bir harf seçin");
		}
		
		
		
	}

}
