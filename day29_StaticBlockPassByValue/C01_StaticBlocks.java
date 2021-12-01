package day29_StaticBlockPassByValue;

public class C01_StaticBlocks {

	static {
		System.out.println("static blok main method'dan bile önce çalışır :)");
	}
	
	
	public static void main(String[] args) {

    
		System.out.println("Javada önce main method çalışır.");

	}
	
		static {
			System.out.println("static blok nereye yazılırsa yazılsın main method'dan önce çalışır ");
		}
	
	//eğer birden fazla static blok varsa java yukarıdakini daha önce çalıştırır
	
	
	
	
	
	
	
	
	
	}


