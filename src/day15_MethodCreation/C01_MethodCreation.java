package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		//iki farkli method olusturun methodlardan biri
		//girilen kelimeleri ilk harf buyuk digerleri kucuk
		//olacak sekilde birlestirsin
		//ikinci method isim ve soyismin ilk harfleri buyuk harf kalan harfler
		//yildiz olacak sekilde birlestirsin
		
		//kullaniciya isminin acik olarak yazilmasi veya gizlenmesi
		//tercihini sorun ve programin kalan kisminda 
		//isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		Scanner scan= new Scanner(System.in);
		String isim= scan.next();
		String soyisim=scan.next();
		System.out.println("Ýsminizin gozukmesini istiyorsaniz 1'e yoksa 2'ye basin");
		int tercih=scan.nextInt();
		String birlesmisIsim= null;
		
		scan.close();
	if (tercih==1) {
		birlesmisIsim= acikIsim(isim,soyisim);
		
	} else if(tercih==2){
		birlesmisIsim= kapaliIsim(isim,soyisim);
	}else {
		System.out.println("Lutfen 1 veya 2 giriniz");
	}
System.out.println("kullanicinin tercihi:" + birlesmisIsim);
	}

	private static String kapaliIsim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() +isim.substring(1).replaceAll("\\w","*");
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
		return isim+" "+soyisim; 

	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase() +isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase() +soyisim.substring(1).toLowerCase();
	
		return isim+" "+soyisim; 

		
	}

}
