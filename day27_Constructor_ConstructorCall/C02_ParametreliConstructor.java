package day27_Constructor_ConstructorCall;

public class C02_ParametreliConstructor {

public static void main(String[] args) {
	
    //Java'nın oluşturduğu default Const. ile obje oluşturabiliyoruz ama her obje için
	//yeniden değer ataması yapmak uzun oluyor.İstersek parametreli const. lar oluşturup
	//daha obje oluşurken istediğim özellikleri atayabilirim

   Car1 car1=new Car1(50000,"Vectra","Siyah",true,2018);
                  //int km , String model, String renk, boolen satılıkMı ,int yıl


   Car1 car2=new Car1(35000);
                    //int km


   System.out.println(car2.km);//35000










}































}
