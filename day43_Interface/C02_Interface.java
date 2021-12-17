package day43_Interface;

public interface C02_Interface {

    void motor(); //normal class'larda accsess modifier yazmazsanız java default accsess modifier kabul eder
                 //interface'de ise acs. mod. yazmazsanız java public kabul eder
		
	
	
	
   /*    interface'de body'si olan bir method yazmak isterseniz java size 2 alternatif sunar
         1-methodun başına "default" keyword yazabilirsiniz
         ancak burda yazılan default accs. modf. değil,Javanın interface için  özel kabul ettiği */
   public default void kaporta() {
    	System.out.println("Default keyword sayesinde body oluşturabildim");
    }

public static void şanzuman() {
	System.out.println("static keyword sayesinde body oluşturabildim");
}

}
