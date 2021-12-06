package Javapracticefull2021;

import java.util.Scanner;

public class C05_HalukBýlgýnHomeworks {

	public static void main(String[] args) {
		  /*  Problem Tanýmý
        Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi yapan kodu yazýnýz
        a'nýn karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        Örnek Ekran Çýktýsý
        a sayýsýný giriniz: 5
        b sayýsýný giriniz: 3
        c sayýsýný giriniz: 1
        sonuç : 5.333333333333333
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen a sayisini giriniz");
		double a= scan.nextDouble();
		
		System.out.println("Lutfen b sayisini giriniz");
		double b= scan.nextDouble();
		
		System.out.println("Lutfen c sayisini giriniz");
		double c= scan.nextDouble();
	
		System.out.println("Sonuc=" +((a*a)-(b*b))/(c*3));
		
		

     // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

     // formula
         
         // c = (f-32)*5/9
		
		System.out.println("Temperature from Fahrenheit to Celsius degree=" +"c=(f-32)*5/9");
		
		
		
		

        /*
        TechProEd spor salonu için kullanýcýdan isim soyisim, yaþ, kilo, boy, salona devam edeceði ay süresini
        bilgilerini alýp aylýk $20 olarak toplam ücretini yazdýrýnýz.
         */
        /*  Problem Tanýmý
        Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný alarak, iþin bitme süresini
        hesaplayan kodu yazýnýz.
        Örneðin, Bir iþçi bir iþi 10 günde yapabilmektedir.
        Buna göre 2 iþçi ayný iþi kaç günde yapar?
        Örnek Ekran Çýktýsý
         Bir iþçi iþi kaç günde bitirmektedir? 10
         Toplam kaç iþçi çalýþacak? 2
        Ýþin bitme süresi 5 gündür.
    */


	}

}
