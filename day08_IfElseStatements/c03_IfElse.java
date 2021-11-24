package day08_IfElseStatements;

import java.util.Scanner;

public class c03_IfElse {

	public static void main(String[] args) {
		
		//Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
        //calismalisin”, 65’den buyukse “Emekli olabilirsin” yazdirin	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen yaşınızı giriniz");
		
		int yaş=scan.nextInt();
		
		if (yaş <65) {
			System.out.println("emekli olamazsın çalışmalısın");
		} else {
            System.out.println("emekli olabilirsin");
		}
		
			scan.close();	
		
		
		
		
		
	}

}
