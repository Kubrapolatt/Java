package day11_stringManipulation;

public class C01_Equals {

	public static void main(String[] args) {
		
	int a=10;
	int b=a+0;
		
	System.out.println(a==b);	//true 
		
	char ch1='K';	
	char ch2='K'+0	;
		
	System.out.println(ch1==ch2);  //true
	
	String str1="Kübra";
	String str2="Polat"	;
	String str3="Kübra Polat";	
	String str4=str1+" "+str2;
	
	System.out.println(str4); //Kübra Polat
	System.out.println(str3==str4); //false
	
	//string variable larda == hem değere hem de referansına
	//bakar dolayısıyla objeler farjklı olduğunda genelde
	//str1.equals(str2) ise referaanslara değil SADECE DEĞERE
	//bakar, eğer case sensitive olarak String değerleri aynı ise
	//true döner.
	
	
	
	}

}
