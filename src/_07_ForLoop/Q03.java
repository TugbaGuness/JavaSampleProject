package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayisini bulunuz.
        ama  c harfine  gelirse donguden cikilsin

        Bugun hava oldukca guzel.-> 2
         

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String isim=scan.nextLine();
        int aMiktari=0;
        
		for (int i = 0; i < isim.length(); i++) {
			if (isim.charAt(i)=='a') {
					aMiktari++;
					
				
			} else if(isim.charAt(i)=='c') {
				break;
			}
			
		}	
		
        
        System.out.println("Girdiginiz stingdeki a sayisi:" +aMiktari);
    }

}
