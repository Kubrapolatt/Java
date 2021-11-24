package day21_Scope_Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun 
		
		String arr[]=new String[4];
        arr[0]="Ali";
        arr[1]="Veli";
	    arr[2]="Ayşe";
	    arr[3]="Fatma";
	
	

	   String arr2[]= {"Ali" , "Veli" , "Ayşe" ,"Fatma"};
	
	  //Soru2: Soru 1 deki elemanlardan "Ali" yerine "Can" ,"Ayşe" yerine "Gül" yazdırın
	
	   arr[0]="Can";
	   arr[2]="Gül";
	
	System.out.println(arr[1]);
	
	//son elemanı yazdırın
	System.out.println(arr[arr.length-1]);//Stringdeki lelngth() idi burada sadece length
	
	//System.out.println(arr[arr.length]);//Yazdığın index sınırların dışında diyor
	                                   //ArrayIndexOutOfBoundsException
	}

}
