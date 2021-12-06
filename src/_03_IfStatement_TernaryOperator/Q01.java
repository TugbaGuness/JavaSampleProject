package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double sayi1=scan.nextDouble();
		System.out.println("Diger sayiyi giriniz");
		double sayi2=scan.nextDouble();
		
		System.out.println("toplama icin -> 1 \ncýkarma icin ->2\ncarpma icin ->3 \nbolme icin ->4");
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.println("sayilarin toplami:" +sayi1+sayi2);		
		}else if (islem==2) {
			System.out.println("sayilarin farki:" +(sayi1-sayi2));
		}else if (islem==3) {
			System.out.println("sayilarin carpimi:"+sayi1*sayi2);	
		}else if (islem==4) {
			System.out.println("sayilarin bolumu:" +sayi1/sayi2);
		}else
			System.out.println("Hatali Giris");
	}

}
