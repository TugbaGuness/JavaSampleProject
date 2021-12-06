package day007_IfStatement;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		// kullanicidan bir tamsayi isteyin
		//sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi= scan.nextInt();
		
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi bir cift sayi");
		}
		if (sayi%2==1) {
			System.out.println("girdiginiz sayi bir tek sayi");
		}
	}

}
