package day007_IfStatement;

import java.util.Scanner;

public class C01_IfBasitCumleler {

	public static void main(String[] args) {
		/*
        * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
        * ve o harfle baslayan gun isimlerini yazdirin 
           Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
           ilkHarf=S output = “Sali”
        *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini yazdirin");
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        
        //Kullanicinin girdiði verinin tamamini kucuk harf veya buyuk harf yazabiliriz
        //touppercase kelimeyi buyuk harfe tolowercase kelimeyi kucuk harfa donusturur
        System.out.println(ilkHarf);
        if (ilkHarf=='P') {
        	System.out.println("Pazar,Pazartesi veya Pazar");
        	
			
		}
        if (ilkHarf=='S') {
        	System.out.println("Salý");
        	
			
		}
        if (ilkHarf=='C' || ilkHarf=='c') {
        	System.out.println("Cuma, Cumartesi");
        	
        	//bircok cesitli carsambayi bir arada yazdiramayiz
        	
        	
			
		}
        
        if (ilkHarf !='C' && ilkHarf!='P' && ilkHarf!='S')
        
        System.out.println("Gecersýz harf girdiniz lutfen gun isimlerinden birinin basharfini giriniz");{
			
		}
	}

}
