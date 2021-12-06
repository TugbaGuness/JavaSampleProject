package day04_JavaMatematikselIslemler;

public class C4_Modulos {

	public static void main(String[] args) {
		
		// 5496 sayisinin rakamlar toplamini bulalim
		
		int sayi=5496;
		int rakamlarToplami=0;
		
		//bir sayinin rakamlar toplamini bulmak icin 3 islem yapariz
		int rakam = sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		//rakamlar toplami=0 sayi=5496
		//sayi=549 rakamlar toplami=6
		//sayi=549

        System.out.println("Rakamlar toplami :" + rakamlarToplami);
		System.out.println("sayinin son degeri :" + sayi);

	}

}
