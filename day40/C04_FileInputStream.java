package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		//Javada bir dosyaya ulaşmak istediğimizde FileInputStream class'ından yardım alabiliriz
		
		
		FileInputStream fis=new FileInputStream("src/day40/yazı.text");
		
		//java bu kodda olası bir problem öngürüyor ve bu prıobleme karşı ne yapması
		//gerektiğini bize soruyor (Yani altı çizilen her kod CTE değildir)
		
		//Bunun için 2 durum söz konusu
		//1-try catch kullanarak bu problemi HANDLE edip javanın yoluna devam etmesini sağlayabilirz
		//2-Eğer dosya okunamıyorsa kod alışmasın istiyorsak olayın farkında olduğumuzu ve sorumluluğun
		//bizde olduğunu javaya söylemeliyiz
		
		
		System.out.println("Görev Tamamlandı");
		
		
		
		
	}

}
