package day013_stringManuplation;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir kelime alin
		//verilen cumlenin kelime ile baslayip baslamadiðini
		//bitip bitmedigini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
        String kelime=scan.next();
		if (cumle.endsWith(kelime)) {
			System.out.println("Girilen cumle " + kelime + " ile bitiyor");
		}else {
			System.out.println("Girilen cumle " + kelime + " ile bitmiyor");
		}
		if (cumle.startsWith(kelime)) {
			System.out.println("Girilen cumle " + kelime + " ile basliyor");
		}else {
			System.out.println("Girilen cumle " + kelime + " ile baslamiyor");
		}
		scan.close();
	}

}
