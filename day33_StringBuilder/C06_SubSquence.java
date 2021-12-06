package day33_StringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");
		
		
		System.out.println(sb.substring(14));//kolay
		
		System.out.println(sb.subSequence(14, 19));//kolay
		
	    //ikiside aynı sonucu döndürür ancak substring methodu string class'ından geldiği için 
		//substring() kullandığımda  arkasından string methodlarını kullanabilirim
		//ancak subsquence kullandığımda bu mümkün olmaz
		
		
		
		

	}

}
