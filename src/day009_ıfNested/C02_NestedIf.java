package day009_ýfNested;

import java.util.Scanner;

public class C02_NestedIf {

	public static void main(String[] args) {
		// kullanicidan 4 basamakli bir sayi girmesini isteyin
		//girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin
		//son rakami 0 ise e ekrana "5'e bolunen cift sayi" yazdirin
		//son rakami 0 degil ise é5'e bolunen tek sayi" yazdirin
		//girdigi rakam 5'e bolunmuyorsa ekrana "Tekrar deneyin"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli pozitif sayi giriniz");
		int sayi=scan.nextInt();
		if (sayi<1000 || sayi>9999) {
			System.out.println("Lutfen 4 basamakli sayi girmelisiniz");	
		}else {
			
		}
			if (sayi%5==0) {//bese bolunenler
				
				if(sayi%10==0) {//son rakam 0
					System.out.println("Bese tam bolunen cift sayi");
				} else { // son rakam 5
					System.out.println("Bese tam bolunen tek sayi");
				}

			
		} else {//bese bolunemeyenler
			System.out.println("Tekrar Deneyin");

		}

	}

}
