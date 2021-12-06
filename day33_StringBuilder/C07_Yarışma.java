package day33_StringBuilder;

public class C07_Yarışma {

	public static void main(String[] args) {
 /* Soru : For loop ile 1000 defa bir islem yapalim. 
  Oncesinde ve sonrasinda zamani kontrol edip 
  StringBuilder ve String class’larinin performanslarini karsilastiralim.   
 
  Ipucu: long TimeSb = System.nanoTime(); kullanalim*/

	
	String str="Merhaba";
	StringBuilder sb=new StringBuilder("Merhaba");
	
	sb.trimToSize();//kapasiteyi length
	
	 long time1=System.nanoTime();
	 
	 for (int i = 0; i <1000; i++) {
		str+=" ";
	}
	
	 long time2=System.nanoTime();
	
	long stringSüre=time2-time1;
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
 long time3=System.nanoTime();
	 
	 for (int i = 0; i <1000; i++) {
		sb.append(" ");
	}
	
	 long time4=System.nanoTime();
	
	long sbSüre=time4-time3;
	
	
	if (sbSüre>stringSüre) {
		
		System.out.println("String daha hızlı");
		
	}else {
		System.out.println("SB daha hızlı");//SB daha hızlı
	}
	
	System.out.println(stringSüre/sbSüre);//26
	System.out.println("String Süre : "+ stringSüre);//String Süre : 3344400
	System.out.println("String Süre : "+ sbSüre);//String Süre : 82400
	
	
	
	}

}
