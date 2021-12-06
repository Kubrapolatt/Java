package day33_StringBuilder;

public class C01_Append_Length_Capactiy {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		
		sb.length();//StringBuilder'ın uzunluğunu verir.
		
		System.out.println(sb.length());//Şuan boş olduğu için 0'dır
		System.out.println(sb.capacity());//uzunluğunu belirtmediğimiz için 16 krk sığacak şekilde yer oluşturur ve kapasitesini verir..  16
		
		
		
		
		StringBuilder sb2=new StringBuilder("Java candır");
		
        System.out.println(sb2.length());//11
		System.out.println(sb2.capacity());//27
	
		
		
		
		StringBuilder sb3=new StringBuilder(7);
		
		sb3.append("Kübra");
		
		System.out.println(sb3.length());//5
		System.out.println(sb3.capacity());//7
		
		
		
		
		StringBuilder sb4=new StringBuilder(5);
		
	    System.out.println(sb4.length());//0
		System.out.println(sb4.capacity());//5
		
		sb4.append("Polat");
		System.out.println(sb4.length());//5
		System.out.println(sb4.capacity());//5
		 
	    sb4.append(" candır");
		System.out.println(sb4.length());//12
		System.out.println(sb4.capacity());//12
		
		sb.append("Java");
		System.out.println(sb);//Java
		
		sb.append(" candır");
		System.out.println(sb);//Java candır
		
		sb.append("anlaşıldı mı?", 3, 4);
		System.out.println(sb);//Java candıra
		
		
		
		
		
		
		
		
		
		
		
	}

}
