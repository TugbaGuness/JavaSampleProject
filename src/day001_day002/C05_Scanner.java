package day001_day002;

import java.util.Scanner;

public class C05_Scanner {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	//kullanicidan isim ve soyismi ayri ayri isteyelim
	
	System.out.println("Lutfen isminizi giriniz...");
	String isim=scan.next();
	System.out.println("Lutfen soyisminizi giriniz...");
	String soyisim=scan.next();
	System.out.println("Girilen isim =" + isim + " " + soyisim); // Girilen isim= tuðba güneþ
}
}
