package day31_DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
	
	LocalDate tarih=LocalDate.now();
		
	System.out.println(tarih);	//2021-12-02
	System.out.println(tarih.getDayOfYear());	//336
	System.out.println(tarih.getDayOfMonth());	//2
	System.out.println(tarih.getDayOfWeek());	//THURSDAY
	System.out.println(tarih.getMonthValue());	//12
    System.out.println(tarih.getMonth());	    //DECEMBER
   
    System.out.println(tarih.lengthOfMonth());  //31
	
    System.out.println(tarih.plusDays(17));	    //2021-12-19
	System.out.println(tarih.plusMonths(5));	//2022-05-02
	System.out.println(tarih.plusWeeks(56));	//2022-12-29
	System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));  //2032-10-12

    System.out.println(tarih.minusDays(20));  //2021-11-12
	System.out.println(tarih.minusWeeks(20)); //2021-07-15
	System.out.println(tarih.minusYears(22)); //1999-12-02
	System.out.println(tarih.minusYears(22).plusDays(17)); // *****************1999-12-19 *****************
	
	System.out.println(tarih.minusYears(21).isLeapYear()); //true
	
	
	LocalDate doğumTarihi1=LocalDate.of(1999, Month.DECEMBER, 19);//1999-12-19
	LocalDate doğumTarihi2=LocalDate.of(2015, 6 , 06);//
	LocalDate doğumTarihi3=LocalDate.of(1980, 01, 01);

	System.out.println(doğumTarihi1+" - "+doğumTarihi2); //1999-12-19 - 2015-06-06
	
	
	System.out.println(doğumTarihi1.isAfter(doğumTarihi2)); //false
	
	
	
	
	
	
	
	}

}
