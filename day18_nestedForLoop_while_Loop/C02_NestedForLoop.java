package day18_nestedForLoop_while_Loop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
		// girdigi sayiya gore asagidaki sekli yazdirin
		// orn : 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen 10'dan küçük pozitif bir tam sayı giriniz : ");

		int sayı = scan.nextInt();

		for (int satır = 1; satır <= sayı; satır++) {

			for (int i = 1; i <= satır; i++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}

		scan.close();

	}

}
