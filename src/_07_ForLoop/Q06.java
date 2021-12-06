package _07_ForLoop;

import java.util.Scanner;

public class Q06 {

    /*  Problem Tanimi
       2 boyutlu bir tablo olarak, ekrana Ã§arpÄ±m tablosunu hesaplayÄ±p yazan kodu yazÄ±nÄ±z.

       Ornek Ekran cıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran cıktısı 5 x 5 boyutlari icin ornek olarak verilmiÅŸtir,
       isterseniz boyutlari klavyeden okuyup istenen boyutlara gÃ¶re
       ekrana basan bir kod yazabilirsiniz.
    */
    public static void main(String[] args) {
    	Scanner scan= new Scanner(System.in);
    	
    	System.out.println("Carpim tablosu:");
    	
    	int boyut=scan.nextInt();
    	
    	for (int baba= 1; baba < boyut; baba++) {
    		for (int evlat = 1; evlat <= boyut; evlat++) {
    		System.out.print(" "+baba*evlat);	
    			
				
			}
			System.out.println();
		}
        
    }
}
