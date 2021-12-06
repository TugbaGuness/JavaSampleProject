package day010_Ternary;

import java.util.Locale;

public class C12_ToUpperCaseLowerCase {

	public static void main(String[] args) {
		// Verilen Stringin tamamini buyuk veya kucuk harfe cevirir
		
		String isim="aLI"; //bunu Ali olarak yazdiralim
		
		System.out.println("" +isim.toUpperCase().charAt(0)
				+isim.toLowerCase().charAt(1)
				+isim.toLowerCase().charAt(2));
		//askii kodlarý girdi devreye
		//"" hiclik eklenmeli
		
		
		
		//turkce lokal harfler kullanarak tamamini kucuk harfe cevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));

	}

}
