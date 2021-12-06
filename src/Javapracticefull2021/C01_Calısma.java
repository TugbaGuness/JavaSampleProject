package Javapracticefull2021;

import java.util.Scanner;

public class C01_Calýsma {

	public static void main(String[] args) {
		//kullanicidan adini soyadini yasinin boyunu kilosunu alt alta yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen Ýsminizi Giriniz");
		String isim=scan.next();
		
		System.out.println("Lutfen SoyÝsminizi Giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lutfen Yasinizi Giriniz");
		int yas= scan.nextInt();
		
		System.out.println("Lutfen Boyunuzu Giriniz");
		double boy= scan.nextDouble();
		
		System.out.println("Lutfen Kilonuzu Giriniz");
		double kilo= scan.nextDouble();
		
		System.out.println("isim:" +isim+ "\n"+"soyisim:" +soyisim+"\n"+"yas:" +yas+ "\n"+"boy:" +boy+ "\n"+"kilo:" +kilo);
		
		//12345 sayýsýný yukaridan asagiya dogru yazdirin
		
				//output: asagýya dogru yazdýr
				// verilen 12345 sayýsýnýn rakamlarýný yukarýdan aþaðýya doðru yazdýrýnýz
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
		
		int yüzler=(sayi/100)%10;
		System.out.println(yüzler);
		
		int binler=(sayi/1000)%10;
		System.out.println(binler);
		
		int onbinler=sayi/10000;
		System.out.println(onbinler);
		
		System.out.println(onbinler+ "\n"+binler+ "\n"+yüzler+ "\n"+onlar+ "\n"+birler);
		
	
		
		
		

	}

}
