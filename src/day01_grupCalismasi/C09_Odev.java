package day01_grupCalismasi;

import java.util.Scanner;

public class C09_Odev {

	public static void main(String[] args) {
		
	        /*Problem Tanimi
	           Kullanicidan bir tarihi gun, ay ve yil seklinde alip bu tarihi
	           ay, gun, yil ve yil, ay, gun siralarina cevirerek yazan bir kod yaziniz.
	           Ornek Ekran ciktisi
	           Lutfen gun giriniz: 10
	           Lutfen ayigiriniz: 02
	           Lutfen yili giriniz: 2009
	           Gun ay yil: 10.02.2009
	           Ay gun yil: 02.10.2009
	           Yil ay gun: 2009.02.10
	        */
	        Scanner scan =new Scanner(System.in);
	        
	        System.out.println("Lütfen gun giriniz");
	        String gun =scan.next();// int kullanýnca 02 yazmýyor 2 yazýyor
	        System.out.println("Lütfen ay giriniz");
	        String ay =scan.next();
	        System.out.println("Lütfen yil giriniz");
	        String yil =scan.next();
	         
	        System.out.println("gun ay yil :" + gun+"."+ay+"."+yil );//:02.10.2009 
	        System.out.println("ay gun yil :" + ay+"."+gun+"."+yil );//10.02.2009
	        System.out.println("yil ay gun :" + yil+"."+ay+"."+gun );//2009.10.02
	        
	        scan.close();
	    
	


	}

}
