package Javapracticefull2021;

import java.util.Scanner;

public class C01_Cal�sma {

	public static void main(String[] args) {
		//kullanicidan adini soyadini yasinin boyunu kilosunu alt alta yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen �sminizi Giriniz");
		String isim=scan.next();
		
		System.out.println("Lutfen Soy�sminizi Giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lutfen Yasinizi Giriniz");
		int yas= scan.nextInt();
		
		System.out.println("Lutfen Boyunuzu Giriniz");
		double boy= scan.nextDouble();
		
		System.out.println("Lutfen Kilonuzu Giriniz");
		double kilo= scan.nextDouble();
		
		System.out.println("isim:" +isim+ "\n"+"soyisim:" +soyisim+"\n"+"yas:" +yas+ "\n"+"boy:" +boy+ "\n"+"kilo:" +kilo);
		
		//12345 say�s�n� yukaridan asagiya dogru yazdirin
		
				//output: asag�ya dogru yazd�r
				// verilen 12345 say�s�n�n rakamlar�n� yukar�dan a�a��ya do�ru yazd�r�n�z
				// ex: input: 12345
//				  output: 1
//				      2
//				      3
//				      4
//				      5
		int sayi= 12345;
		
		int birler= sayi%10;
		System.out.println(birler);
		
		int onlar= (sayi/10)%10;
		System.out.println(onlar);
		
		int y�zler=(sayi/100)%10;
		System.out.println(y�zler);
		
		int binler=(sayi/1000)%10;
		System.out.println(binler);
		
		int onbinler=sayi/10000;
		System.out.println(onbinler);
		
		System.out.println(onbinler+ "\n"+binler+ "\n"+y�zler+ "\n"+onlar+ "\n"+birler);
		
	
		
		
		

	}

}
