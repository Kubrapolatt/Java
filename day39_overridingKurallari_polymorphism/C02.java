package day39_overridingKurallari_polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		
	 C02 obj1=new C02();
	 obj1.privateMethod();
	 obj1.staticMethod();
	 
		
	 C01 obj2=new C02();
	// obj2.privateMethod();
	//data türü C01 olduğundan öncelikle C01 class'ındaki methoda 
    //bakmamız gerekir ancak private olduğundan ulaşamayız
    //ulaşamadığımız bir method'u override yapamayız
    //dolayısıyla signature aynı olmasına RAĞMEN bu ikisi farklı
	//iki method olarak çalışır
	 obj2.staticMethod();
	//static methodlar override edilemez dolayısıyla 
	//signature aynı olmasına RAĞMEN bu ikisi farklı
	//iki method olarak çalışır
	 
	
	}
	public static void staticMethod() {
		
		System.out.println("Child class static method çalıştı");
	}
	private void privateMethod() {
		System.out.println("Child class private method");
	}
	/*public final void finalMethod() {
		System.out.println("Child class final method ");
	}*/
}



