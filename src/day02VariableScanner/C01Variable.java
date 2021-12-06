package day02VariableScanner;

import java.util.Scanner;

public class C01Variable {

	public static void main(String[] args) {
		
		//Farklý 3 data turunde variable olusturun
		
		String str = "Merhaba"; //satirdaki kod sonunda mutlaka noktali virgul konulmali
		
		System.out.println(str); // kelimenin variable oldugunu anlar ve onu yazdirir
		System.out.println("kelime"); // burada ise kelime yazdirir
		
		int sayi=20;
		System.out.println(      sayi      ); 
		//yazdirirken basina aciklama eklemek istersek
		// girilen sayi : 20
		// eger degisken ve aciklamayi girmek istersek "aciklama"+ variable ismi
		
		System.out.println("girilen sayi : " + sayi);
		boolean tatildeMi = true ;
		System.out.println(tatildeMi);
		//konsolda bu sene tatile gittin mi? = true
		System.out.println("konsolda bu sene tatile gittin mi? : " + tatildeMi);
		
		//isim ve soy isim icin iki variable olusturun
		// isminiz : Tugba
		// soyisminiz : Gunes
		String name="Tugba";
		String surname="Gunes";
		System.out.println("isminiz : " + name );
		System.out.println("soyisminiz : " + surname );
		
		// iki farkli data turunde variable olusturun bunlarin toplamini yazin
		
		int sayi1 = 10;
		byte sayi2 = 5;
		System.out.println(sayi1 + sayi2 );
		
		//toplama isleminin basina aciklama eklemek istersek
		System.out.println("iki sayinin toplamý = " + (sayi1 + sayi2) );
		
		//string ve sayisal islemleri birlikte yaptirinca islemi parantez icine alin
		
		//bir tam sayi ve bir ondalikli sayinin toplamini olusturmak icin
		
		int sayi3 = 15;
		double sayi4 = 3.0;
		System.out.println(sayi3 + sayi4);
		
		// toplam : 18.0
		System.out.println("toplam : " + (sayi3 + sayi4) );
		
		// char data turunde bir variable olusturun ve yazdirin
		
		char karakter ='?'; 
		System.out.println(karakter);
		System.out.println("girilen karakter : " + karakter );
		
		// bir tamsayi bir de char olusturun bunlarin toplamini yazin
		
		int sayi5 = 20;
		char harf = 'M';
		System.out.println(sayi5 + harf); 
		
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
		
		int sayi6 = scan.nextInt();
		int sayi7 = scan.nextInt();
		
		System.out.println("iki sayinin toplami : " + (sayi6+sayi7));
		
		
	//Kullanicidan ismini ve soyismini alip aralarinda bir bosluk birakin yazdirin
		//isim - soyisim : Tugba Gunes
		
		System.out.println("Lutfen isminizi giriniz");
		String namee= scan.next();
		System.out.println("Lutfen soyisminizi giriniz");
		String surnamee= scan.next();
		
		System.out.println("Ýsim - soyisim : " + namee + " "+surnamee);
		scan.close();
		
	}

}
