package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {
    Scanner scan=new Scanner (System.in);
    System.out.println("Lutfen aldiginiz urunun adedini giriniz");
    int adet=scan.nextInt();
    System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
    double fiyat=scan.nextDouble();
    System.out.println("Musteri kartiniz var midir?");
    boolean kart=scan.hasNext();
    if (kart=true && adet>10) {
    	fiyat=fiyat-((fiyat*20)/100);
    	System.out.println("Yuzde 20 indirim kazandýnýz;" +fiyat);
		
	} else if(kart=false && adet>10){
		fiyat=fiyat-((fiyat*15)/100);
		System.out.println("Yuzde 15 indirim kazandýnýz;" +fiyat);

	}else if(adet<10) {
		fiyat=fiyat-((fiyat*10)/100);
		System.out.println("Yuzde 10 indirim kazandýnýz;" +fiyat);
		
	}else {
		System.out.println("Yalnis islem girdiniz");
	}
		
	}

}
