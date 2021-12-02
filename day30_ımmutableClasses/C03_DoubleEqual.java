package day30_ımmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {

   String str1="Kübra";
   String str2="Kübra";
		
	
   String str3=new String("Kübra");
   String str4=new String("Kübra");	
   
   System.out.println(str1==str3);	//false
   System.out.println(str1.equals(str3));//true
		
   System.out.println(str4==str3);//false
   System.out.println(str4.equals(str3));//true
		
   System.out.println(str1==str2);//true);	
		

	
	
	
	
	}

}
