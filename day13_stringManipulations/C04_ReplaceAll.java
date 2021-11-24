package day13_stringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		
		
	String str="*java ogrenmek c..ok kolay "	;
	//replaceAll metodları kullanarak JAVA ÖĞRENMEK ÇOK KOLAY yapıcaz
	
	str=str.replaceAll("\\d", " ");
	System.out.println(str); // *java ogrenmek c..ok kolay
	
		
	str=str.replaceAll("\\s", "x");//*javaxogrenmekxc..okxkolayx
	System.out.println(str);
	
	
	str=str.replaceAll("\\W", ""); //javaxogrenmekxcokxkolayx
	System.out.println(str);//
	
	
	str=str.replaceAll("x", " ");//java ogrenmek cok kolay 
	System.out.println(str);
	
	
	
	}

}
