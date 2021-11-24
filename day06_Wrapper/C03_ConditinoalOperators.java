package day06_Wrapper;

public class C03_ConditinoalOperators {

	public static void main(String[] args) {

    System.out.println(5+3==8 || 6+5==10 || 7-2==3);//true
		
    System.out.println(5+3==8 && 6+5==10 && 7-2==3);	
		
	int a=10;
	int b=20;
	int c=30;
	
	 boolean sonuc= a>b || b>c || a+b>=c;
	 
	 System.out.println(sonuc);
		
	//&& işareti yerine  & de kullanılabilir 
	 //ancak arada ince bir fark var
	 // && işareti ilk false u bulduğunda bu işlemin sonucunun false
	 //olacağını bilir ve geriye kalan işlemleri 
	 //kontrol eetmeden sonucu false yazdırır
	 //& işareti ise once tüm işlemleri bitirir sonra sonucu false olaarak yazdırır
	 
	 System.out.println(5+3==8 && 6+5==10 && 7-2==3 && 5>=2 && 7+3 <=10);//false
	 
	 System.out.println(5+3==8 & 6+5==10 && 7-2==3 & 5>=2 & 7+3 <=10);
	
	
	}

}
