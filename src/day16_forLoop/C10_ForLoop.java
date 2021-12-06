package day16_forLoop;

import java.util.Scanner;

public class C10_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin. 
		//Girilen sayilar ve aralarindaki tum tamsayilari toplayip, 
		//sonucu yazdiran bir program yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz diger sayiyi girmek icin enter a basiniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int kucuk=0;
		int buyuk=0;
		int toplam=0;
		if (sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
			
		}else {
			buyuk=sayi2;
			kucuk=sayi1;
			
		}
		
		for (int i = kucuk; i <=buyuk; i++) {
			toplam+=i;
			
		}
		System.out.println("girilen iki sayi arasýndaki sayilarin toplami:" +toplam);
	}
}