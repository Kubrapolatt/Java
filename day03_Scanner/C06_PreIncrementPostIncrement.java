package day03_Scanner;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
	//preInc ve postInc sadece sayı++ ve sayı-- yazımı için geçerlidir
	int sayi=10;
	
	sayi++;
	sayi++;
	sayi++;
	
	System.out.println(sayi);//13
	
	
	System.out.println(sayi++);//bu satırda iki işlem var 13
	//bir artırma,bir yazdırma var
	
	//önce artırmak sonra yazdırmak isterseniz o zaman ++ sayı yazmalıyız
	//önce yazdırmak sonra arttırmak isterseniz sayı++
	
	
	System.out.println(sayi); //14
	
	System.out.println(++sayi);//15
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
