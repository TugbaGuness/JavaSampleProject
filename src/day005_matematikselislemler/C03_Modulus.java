package day005_matematikselislemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		//kullanicidan 3 basamakli bir sayi alip
		//rakamlar toplamini yazdiran bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		//sayi 573 olsun
		
		int rakamlarToplami=0;
		int rakam= sayi%10; //birler basamagini verir
		//rakam:3
		
		rakamlarToplami+=rakam; //rakamlartoplami:3 oldu
		
		System.out.println(rakamlarToplami);
		
		sayi/=10; 
		System.out.println(sayi); //57
		
		rakam=sayi%10;
		System.out.println(rakam); //rakam:7
		
		rakamlarToplami+=rakam; //rakamlartoplami:10 oldu
		
	sayi/=10;
	System.out.println(sayi); //5
	rakam=sayi;
	rakamlarToplami+=rakam; //rakamlartoplami:15 oldu
			System.out.println("Girdiginiz sayinin rakamlar toplami :" + rakamlarToplami); //15oldu
	
		
		
		
		
		
		

	}

}
