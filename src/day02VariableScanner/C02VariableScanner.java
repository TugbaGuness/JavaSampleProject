package day02VariableScanner;

import java.util.Scanner;

public class C02VariableScanner {

	public static void main(String[] args) {
		// bir tamsayi bir de char olusturun bunlarin toplamini yazin
		
				int sayi1 = 20;
				char harf = 'M';
				System.out.println(sayi1 + harf); 
				
				// ascii tablosu matematiksel karsýlýk
				// char data türü matematiksel islemde kullanilinca ascii degeri devreye girer
				// M = 77 ascii degeri
				
				//kullanicidan iki tamsayi alip bu sayilarin toplam, fark ve carpimlarini yazin
				
				//kullanicidan deger almak icin üc adim atlama
				//1. adim Scanner objesi olusturalim
				
				Scanner scan = new Scanner (System.in); 
				
				///object olusturuldu non primitive
				
				// 2. adim kullanicidan ne istedigimizi yazdiralim
				System.out.println("Lütfen iki tamsayi giriniz");
		        // 3. adim next methodunu kullanarak olusturulan variable'lara atayalim
				
				int sayi2 = scan.nextInt();
				int sayi3 = scan.nextInt();
				
				System.out.println("iki sayinin toplami : " + (sayi2+sayi3));
scan.close();

	}

}
