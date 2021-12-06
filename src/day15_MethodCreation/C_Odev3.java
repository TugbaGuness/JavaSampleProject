package day15_MethodCreation;

import java.util.Scanner;

public class C_Odev3 {

	public static void main(String[] args) {
		//Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
				//numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
				//sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
				//duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
				//geri dondurun.
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		System.out.println("Lutfen kart numaranizi bosluk olmadan giriniz");
        String kartNumarasi=scan.next();
        
        String isimDegisim=isimSoyisim(isim, soyisim);
        String kkFormatli=kartNo(kartNumarasi);
        
       System.out.println(isimDegisim);
       System.out.println(kkFormatli);
      


	}

	private static String isimSoyisim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
        
		return isim+" "+soyisim;
		
	}

	private static String kartNo(String kartNumarasi) {

		kartNumarasi=kartNumarasi.substring(0, 4)+kartNumarasi.substring(5, 6).replaceAll("\\d", " ")+kartNumarasi.substring(4, 8)+kartNumarasi.substring(5, 6).replaceAll("\\d", " ")+
				kartNumarasi.substring(8, 12)+kartNumarasi.substring(5, 6).replaceAll("\\d", " ")+	kartNumarasi.substring(12,16)	;
						
		
		return kartNumarasi;
	}

	
	}

	
	


