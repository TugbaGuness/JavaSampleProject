package day008_IfElseStatement;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve 
       //dikdortgenin kare olup olmadigini yazdirin
Scanner scan= new Scanner (System.in);
System.out.println("Lutfen dikdorgenin bir kenar uzunluðunu giriniz");
double kenar1= scan.nextDouble();

System.out.println("Lutfen dikdorgenin diger kenar uzunluðunu giriniz");
double kenar2= scan.nextDouble();
if (kenar1==kenar2) {
	System.out.println("girilen olculer karedir");
	
} else {
System.out.println("girilen olculer kare degildir");

}

	}

}
