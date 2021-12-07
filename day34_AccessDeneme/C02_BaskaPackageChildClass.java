package day34_AccessDeneme;

import day34_AccessModifier_Encapsulation.C01;

public class C02_BaskaPackageChildClass  extends C01{

	public static void main(String[] args) {
	
		
			C01 obj=new C01();
			
			// System.out.println(obj.sayiPrivate);
			// System.out.println(obj.sayiDefault); main method'dan ulasamamizin sebebi static klubu ile ilgili
			System.out.println(obj.sayıPublic);
		

		}
		
		
		public void staticOlmayanMethod() {
			C01 obj=new C01();
			// System.out.println(obj.sayiDefault);
			
			System.out.println(sayıProtected); // bu class'da sayiProtected diye bir variable
												// olmadigi halde, parent class'da var oldugu icin
												// Java problem yapmadi
			
			System.out.println(obj.sayıPublic);

		 			
		
	}
}
