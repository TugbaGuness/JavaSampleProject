package day01_grupCalismasi;

import java.util.Scanner;

public class C08_Odevler {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		
		saat();
		mil();
		kg();

	}

	private static void kg() {
		Scanner scan=new Scanner(System.in);
		double kg=scan.nextDouble();
		double gram=scan.nextDouble();
		kg=1000*gram;
		System.out.println("Verilen kg degerinin grama cevrilmesi:" +kg);
		
	}

	private static void mil() {
		Scanner scan=new Scanner(System.in);
		double mil=scan.nextDouble();
		double km=scan.nextDouble();
		mil=km*1.609344;
		System.out.println("Verilen mil degerinin km'ye cevrilmesi:" +mil);
		
		
	}

	private static void saat() {
		Scanner scan=new Scanner(System.in);
		double saat=scan.nextDouble();
		double saniye=scan.nextDouble();
		saniye=saat*3600;
		System.out.println("Verilen saat degerinin saniyeye cevrilmesi:" +saniye);
		
		
		
	}

}
