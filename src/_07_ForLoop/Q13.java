package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		 Scanner scan = new Scanner (System.in); 
		    System.out.println("Lutfen cumle giriniz");
		    String cumle=scan.nextLine();
		    System.out.println("Lutfen cumlede yer alan bir harf giriniz");
				char ch1=scan.next().charAt(0);
		     int krkMiktari=0;
		        
				for (int i = 0; i < cumle.length(); i++) {
					if (cumle.charAt(i)==ch1) {
							krkMiktari++;
							
						break;
					} 
					}
		  
					System.out.println("Girdiginiz cumledeki harf sayisi:" +krkMiktari);
		  

	}
}

