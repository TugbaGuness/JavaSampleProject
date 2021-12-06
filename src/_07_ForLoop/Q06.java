package _07_ForLoop;

import java.util.Scanner;

public class Q06 {

    /*  Problem Tanimi
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Ornek Ekran c�kt�s�
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran c�kt�s� 5 x 5 boyutlari icin ornek olarak verilmiştir,
       isterseniz boyutlari klavyeden okuyup istenen boyutlara göre
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
