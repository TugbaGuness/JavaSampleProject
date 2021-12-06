package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C01_LocalDate {

	private static final Month January = null;

	public static void main(String[] args) {
		
		LocalDate tarih= LocalDate.now();
		
		System.out.println(tarih); //2021-12-02
		
		System.out.println(tarih.getDayOfMonth());
		System.out.println(tarih.getDayOfYear());
		System.out.println(tarih.getMonthValue());
		System.out.println(tarih.getDayOfWeek());
		System.out.println(tarih.getMonth());
/*2
336
12
THURSDAY
DECEMBER*/
		//tarihe 10 yýl 10 ay eklemek istiyoruz
		
		
		System.out.println(tarih.plusYears(10).plusDays(10).plusMonths(10));
		//2032-10-12
		//tarihe 10 yýl 10 ay eklemek cikariyoruz

		System.out.println(tarih.minusDays(10).minusMonths(10).minusYears(10));
		//2011-01-22
		
		
		System.out.println(tarih.minusYears(21).isLeapYear()); //true
		
		
		LocalDate dogumTarihi2= LocalDate.of(1998, Month.JANUARY, 12);
		
		LocalDate dogumTarihi1= LocalDate.ofYearDay(2000,136);
		
		System.out.println(dogumTarihi2); //1998-01-12
		System.out.println(dogumTarihi1); //2000-05-15
		
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2));//true
		
		
		
		
		
		
	}

}
