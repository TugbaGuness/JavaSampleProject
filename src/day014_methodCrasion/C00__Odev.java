package day014_methodCrasion;

import java.util.Scanner;

public class C00__Odev {

	public static void main(String[] args) {
		// Kullanıcıdan iki sayi isteyin
				// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
				// Kullaniciya us sorun
				// 2 yazarsa kareleri toplamini yapan method , 3 yazarsa kupler toplamini yapan method calissin,,
				
				
				Scanner scan=new Scanner (System.in);
				System.out.println("Lutfen ilk sayiyi giriniz \nilk sayidan sonra enter'a basin ");
				double sayi1=scan.nextDouble();
				double sayi2=scan.nextDouble();
				
				System.out.println("Girilen sayilarin kareler toplamini istiyorsaniz 2 "
						+ "\nGirilen sayilarin kareler toplamini istiyorsaniz 3 e basin");
				int secim=scan.nextInt();
				
				switch(secim) {
				
				case 2:
					karelerininToplami(sayi1,sayi2);
					break;
					
				case 3:
					kuplerinintop(sayi1,sayi2);
					break;
					
					default:
						System.out.println("Lutfen istenen tercihlerden birini yapiniz");
				}
		
		
	}

	private static void kuplerinintop(double sayi3, double sayi4) {
		double kuplerToplami= sayi3*sayi3*sayi3+sayi4*sayi4*sayi4;
		System.out.println("Girilen sayilarin kupleri toplami:" +kuplerToplami);
	}

	private static void karelerininToplami(double sayi3, double sayi4) {
		double karelerToplami= sayi3*sayi3+sayi4*sayi4;
		System.out.println("Girilen sayilarin kareleri toplami:" +karelerToplami);
		
	}
	}


