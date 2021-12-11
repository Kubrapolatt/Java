package day38_overriding;

public class Balıklar extends Animals {

	public static void main(String[] args) {
		
	Balıklar balık1=new Balıklar();
	balık1.beslenme();//Tüm hayvanlar beslenir
    balık1.hareket();//Balıklar yüzerek hareket eder
    balık1.solunum();//Balıklar solungaçlarıyla nefes alır
    
  }
	@Override
	
	//child class'daki bir method'u override 
	//ediyorsa bunu istersek @Override notasyonu ile deklare edebilirz
	//Deklare etmezsek de kodlarımız çalışır ancak deklare
	//ettiğimizde Java overriden method'u sürekli kontrol
	//eder ve o method'da overriding'e uymayan bir değişiklk olursa CTE verir
	
	public void hareket() {
		System.out.println("Balıklar yüzerek hareket eder");
	}
	
	public void solunum() {
		System.out.println("Balıklar solungaçlarıyla nefes alır");
	}
	
}
