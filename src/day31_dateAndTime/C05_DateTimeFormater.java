package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormater {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		System.out.println(tarihSaat);//2021-12-02T23:44:39.638764200
		//Eger tarih ve saati kendi istedigimiz bicimde yazdirmak istersek
		
		//gun/ay/yil saat: dakika
		
		DateTimeFormatter duzenle= DateTimeFormatter.ofPattern("dd / MM / YYYY EEEE HH : mm");
		
		//M month m minute
		//HH 24 saatlik dilim
		//DD yilin günü
		System.out.println(duzenle.format(tarihSaat)); //02 / 12 / 2021 Perþembe 23 : 52
		
		
	}

}
