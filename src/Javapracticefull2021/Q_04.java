package Javapracticefull2021;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1. sayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("2. sayiyi giriniz");
		int sayi2=scan.nextInt();
		System.out.println("girilen sayilarin �arp�m�:" +(sayi1*sayi2));
		System.out.println("girilen sayilarin bolumu:" + (sayi1/sayi2));
		System.out.println("girilen sayilarin toplam�:" +(sayi1+sayi2));
		System.out.println("girilen sayilarin ��karmas�:" +(sayi1-sayi2));
		
		

	}

}
