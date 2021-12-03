package Questions;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*  Check if the integer is an Armstrong numbers
		 * Tam sayının bir Armstrong sayısı olup olmadığını kontrol edin
       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
​
         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
*/

	
		    Scanner scan = new Scanner(System.in);
	        System.out.print("Sayı giriniz : ");
	
	        int num=scan.nextInt();
	        int rakam;
	        int toplam=0;
	        int num1=num;
	        
	        while (!(num==0)) {
				rakam=num%10;
			    toplam+=rakam*rakam*rakam;
			    num/=10;
	        }
	
	if (num1==toplam) {
		System.out.println("Sayı armstrong bir sayı");
	}else {
		System.out.println("Sayı armstrong bir sayı değildir.");
	}
		
		
	
	
	
	
	
	}

}
