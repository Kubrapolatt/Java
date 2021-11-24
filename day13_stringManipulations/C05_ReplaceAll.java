package day13_stringManipulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		
	String cümle="Java   cok    zevkli";
	
	cümle=cümle.replaceAll("\s+", " ");
	
	System.out.println(cümle); //Java çok zevkli
	
	System.out.println(cümle.replaceAll("[a-z]", " ")); //J
	
	System.out.println(cümle.replaceAll("\\S", "*")); //**** *** ******
	
	System.out.println(cümle.replaceAll("\\s", "*")); //Java*cok*zevkli


	
	
	}

}
