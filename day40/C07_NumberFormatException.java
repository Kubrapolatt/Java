package day40;

public class C07_NumberFormatException {

	public static void main(String[] args) {
		
		String str="123a";
		
		int sayı=Integer.parseInt(str)+4;
		
		System.out.println(sayı);//127
		
		

	}

}
