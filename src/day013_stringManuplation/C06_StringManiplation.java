package day013_stringManuplation;

import java.util.Scanner;

public class C06_StringManiplation {

	public static void main(String[] args) {
		//Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		System.out.println("Lutfen kart numaranizi bosluk olmadan giriniz");
        String kartNumarasi=scan.next();
        String isimFormatli=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        String soyisimFormatli=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
        System.out.println("isim-soyisim:" +isimFormatli + soyisimFormatli);
        String kkFormatli="**** **** **** " + kartNumarasi.substring(12);
        System.out.println("kart no: " +kkFormatli);
	}

}
