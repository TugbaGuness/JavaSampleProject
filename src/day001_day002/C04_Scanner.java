package day001_day002;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
	//kullanicidan deger almak icin üc adim takip edilir
		//1. adim scanner objesi olusturmak,
		Scanner scan= new Scanner(System.in);
		//ikinci adim kullaniciya ne istedigimizi soylemek
		System.out.println("Lutfen isminizi yaziniz");
		
		String isim= scan.next();
		System.out.println("isminiz=" + isim);
		// scan bir scanner objesidir isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		// scan non primitive dir data türü olarak
		// primitive data turleri sadece deger icerirken non primitive degerin yaninda birde method barindirir
		// scan. dedigimizde kullanilacak bircok method vardir //isim. ayni sekilde
		scan.close();
		

	}

}
