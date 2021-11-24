package day04_IncrementDecrement;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
	
	// kullanıcıdan değer almak için 3 adım takip edilir
	// 1.adım SCANNER OBJESİ OLUŞTURMAK	
		
		
		Scanner scan=new Scanner(System.in);
		

		// ikinci adım kullanıcıya ne istediğimizi söylemek
		
		
		System.out.println("lutfen isminizi yazınız");
		
		String isim=scan.next();
		
		System.out.println("isminiz..:"+isim);
		
		
		//scan bir scanner objesidir
	    //isim olarak farklı bir isim yazsak da çalışır ama biz scan demeyi tercih ederiz
		//scan bir obje olduğu için non primitive dir
		//primitive data türleri sadece değer içerirken,
		//non primitive data türleri değerin yanında methodlar bulundurur
	    //scan. dediğimizde kullanabileceğimiz bu methodları görebiliriz
		
	}

}
