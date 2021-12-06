package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02LocalTime {

	public static void main(String[] args) {
		
		LocalTime saat=LocalTime.now();
		System.out.println("baslangic saati" + saat);//baslangic saati23:10:06.679337500
		
		int sayi=10;
		for (int i = 0; i <100000; i++) {
			sayi++;
				
		}
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati" + saatBitis);//bitis saati23:10:06.680335500
		//eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		//hem basinda hem sonunda local time objesi olusturmaliyiz
		
	    double nano1=saat.getNano();
	    double nanoBitis=saatBitis.getNano();
		System.out.println("For loop " +(nanoBitis-nano1) + " nano saniyede tamamladi");
		//For loop 5987400.0nano saniyede tamamladi
		LocalTime saatBitisS=LocalTime.now();
		
		
		 System.out.println(saat.getMinute());//29 21.29 dakikasi
		 System.out.println(saat.plusMinutes(10000)); //10bin dk sonra 22:10:22.081765500
		
		 LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
		 System.out.println(yerelSaat);//23:35:16.381388500
		
	}

}
