package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel"
		//cumlesinin kelimelerini ters sirada yazdirin
		
		String cumle="Java ogrenmek cok kolay";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));//[Java, ogrenmek, cok, kolay]
		for (int i =kelimeler.length-1; i >=0; i--) {
			
			System.out.print(kelimeler[i] + " ");
			
		}

	}

}
