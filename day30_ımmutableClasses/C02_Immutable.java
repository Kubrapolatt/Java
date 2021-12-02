package day30_ımmutableClasses;

public class C02_Immutable {

	public static void main(String[] args) {


		String str="Kübra";
		
		for (int i = 0; i < 100; i++) {
			str+=" ";
			
		}
		
		//Bu kod çalıştığında java kaç obje oluşturur? 
		//====> Bir obje başta oluşturuldu loop da ise 100 obje daha oluşturuldu 
		//dolayısıyla bu kod çalıştığında biz ekranda hiçbir şey görmeyiz 
		//ama java 101 obje oluşturmuş olur str'ın son değeri ise "Kübra        (100 tane boşluk )       "
	
		System.out.println(str);
		
		
		
		
		
		
		
	}

}
