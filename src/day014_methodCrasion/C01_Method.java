package day014_methodCrasion;

public class C01_Method {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
		
		//method olusturmak icin dort adim takip edelim
		//1. adim method call yazalim
		//2. adim methoda arguman yazacak miyiz karar vermeliyiz
		//3. adim 1. ve 2. adimi yaptiktan sonra java dan yardim alip methodu olusturunuz
		
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1, sayi2); // method call		

	}

	public static void toplama(int sayi1, int sayi2) {
		// 4. adim erisim duzenleyici ve return type karar vermeliyiz
		//erisim duzenleyici axcess modifier : bu methodu kimler kullansin
		//private olursa sadece bu methodu kullananlar bakabilir
		//public herkes
		//return type: býzden sadece yazdirma istedigi icin void kalabilir
		System.out.println("sayilarin toplami:" + (sayi1+sayi2));
		
		carpma(sayi1, sayi2);
	}

	private static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi:" + (sayi1*sayi2));
		
		
	}

}
