package day007_IfStatement;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		//kullanicidan dikdörtgenin kenar uzunluklarini isteyin
		// ve dikdörtgenin kare olup olmadigine bakin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdorgenin bir kenar uzunluðunu giriniz");
        double kenar1= scan.nextDouble();
        
        System.out.println("Lutfen dikdorgenin diger kenar uzunluðunu giriniz");
        double kenar2= scan.nextDouble();
        
        
        if (kenar1==kenar2) {
        	System.out.println("Girilen dikdortgen kare");
        }	
        if (kenar1!=kenar2) {
        System.out.println("Girilen dikdortgen kare degil");
				
			}
			

        
	}

}
