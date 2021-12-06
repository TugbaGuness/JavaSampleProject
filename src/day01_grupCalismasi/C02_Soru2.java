package day01_grupCalismasi;

import java.util.Scanner;

public class C02_Soru2 {

	public static void main(String[] args) {
		//  2 - ) Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut kutle     
	  //endeksini bulun. Sonucu tamsayi ve ondalikli sayi olarak yazdirin
	 // VKE= kilo/(boy*boy)             Kilo : kilogram , Boy : metre olmalidir
	//Ornek Ekran Ciktisi:
	// Input : boy :180 kilo : 80
    //Output : Vucut kutle endeksiniz : 24
	//Vucut kutle endeksiniz : 24.691...
		
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Lutfen kilonuzu giriniz");
	     double kilo=scan.nextDouble();
	     System.out.println("Lutfen boyunuzu giriniz");
	     double boy=scan.nextDouble();
	     double bedenKýtleIndeksi= kilo/(boy/100*boy/100);
	     
	     
	     if (bedenKýtleIndeksi<=20) {
	    	 System.out.println("Oldukca zayifsiniz");	
		}else if (bedenKýtleIndeksi<=25) {
			System.out.println("Normal sinirlardasiniz");
		}else if (bedenKýtleIndeksi<=30) {
			System.out.println("Sisman kategorisindesiniz");
		}else if (bedenKýtleIndeksi>30) {
			System.out.println("Obez grubundasiniz");
		}else {
			System.out.println("Yalnis girdiniz");
		}
			
	     
	     

	}

}
