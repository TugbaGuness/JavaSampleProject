package day007_IfStatement;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		//kullanicidan dikd�rtgenin kenar uzunluklarini isteyin
		// ve dikd�rtgenin kare olup olmadigine bakin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdorgenin bir kenar uzunlu�unu giriniz");
        double kenar1= scan.nextDouble();
        
        System.out.println("Lutfen dikdorgenin diger kenar uzunlu�unu giriniz");
        double kenar2= scan.nextDouble();
        
        
        if (kenar1==kenar2) {
        	System.out.println("Girilen dikdortgen kare");
        }	
        if (kenar1!=kenar2) {
        System.out.println("Girilen dikdortgen kare degil");
				
			}
			

        
	}

}
