package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		//Verien bir int sayı array'i için kullanıcıdan sayı isteyin
		//ve girilen sayıyı index olarak kabul edip
		//o indexteki elementi yazdırın
		
		//ArrayIndexOutOfBoundsException
		//InputMismatchException
		
		int [] arr= {2,3,5,6,2,7,9,1};
		
		try {
			Scanner scan=new Scanner(System.in);
			 System.out.print("Lütfen elemnti yazdırmak için index giriniz:");
			 int index=scan.nextInt();
			 
			 System.out.println("Girdiğiniz indexteki element : "+arr[index]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
		    
		     System.out.println("Girdiğiniz index array'de yok.");
		
		}catch (InputMismatchException e) {
		     System.out.println("Girdiğiniz index pozitif tam sayı olmalı.");

		} 
		
		
	}

}
