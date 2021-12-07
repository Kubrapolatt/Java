package day34_AccessDeneme;

import day34_AccessModifier_Encapsulation.C01;

public class C01_BaşkaPackage {

	public static void main(String[] args) {
		 C01 obj=new C01();
		 
		  //System.out.println(obj.sayıDefault); * sadece aynı package'dakiler ulaşabilir*
		 // System.out.println(obj.sayıPrivate);  *static'de olsa private variablara sadece kendi class inda gorulur*
		// System.out.println(obj.sayıProtected); *aynı package'da ki class'lar ve chil class'lar ulaşabilir
		 System.out.println(obj.sayıPublic);
			

	}

}
